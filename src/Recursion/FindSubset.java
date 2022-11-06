package Recursion;

public class FindSubset {

	public static void main(String[] args) {
		System.out.println("Java Exercises");

		int[] arr = {2, 4, 6, 10};
		int total = 16;
		int res = countSets(arr, total);
		
		System.out.println(res);
		
        String s = "abc";
        printPermutn(s, "");
        
	}


	public static int countSets(int[] arr, int total) {
		return rec(arr, total, arr.length - 1);
	}
	
	public static int rec(int[] arr, int total, int i) {
		if (total == 0)
			return 1;
		else if (total < 0)
			return 0;
		else if (i < 0)
			return 0;
		else if (total < arr[i])
			return rec(arr, total, i-1);	
		else
			return rec(arr, total - arr[i], i-1) + rec(arr, total, i-1);
	}

	
    static void printPermutn(String str, String ans)
    {
 
        // If string is empty
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }
 
        for (int i = 0; i < str.length(); i++) {
 
            // ith character of str
            char ch = str.charAt(i);
 
            // Rest of the string after excluding
            // the ith character
            String ros = str.substring(0, i) +
                        str.substring(i + 1);
 
            // Recursive call
            printPermutn(ros, ans + ch);
        }
    }
}
