package JavaExercise;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.stream.IntStream;

class MyObj implements Comparable<MyObj> {
	
	public int priority;
	public String name;
	
	MyObj(String name, int priority){
		this.name = name;
		this.priority = priority;
	}

	@Override
	public int compareTo(MyObj o) {
	    if(priority<o.priority){  
	        return 1;  
	    }else if(priority>o.priority){  
	        return -1;  
	    }else{  
	    	return 0;  
	    } 
	}
	
}

public class Exercise {
	
	private int num;
	

	public static void main(String[] args) {
		System.out.println("Java Exercises");
		
		String name = "1234567890";
		
		
		MyObj o1 = new MyObj("First", 1);
		MyObj o2 = new MyObj("Second", 2);
		MyObj o3 = new MyObj("Third", 1);
		MyObj o4 = new MyObj("Forth", 4);
		
		
		PriorityQueue<MyObj> pq = new PriorityQueue<MyObj>();
		pq.add(o1);
		pq.add(o4);
		pq.add(o3);
		pq.add(o2);
		
		
		System.out.println(pq.peek().name);
		System.out.println(pq.peek().name);
		System.out.println(pq.poll().name);
		System.out.println(pq.peek().name);
		
		System.out.println(pq.peek().name);
		System.out.println(pq.peek().name);
		System.out.println(pq.peek().name);
		System.out.println(pq.peek().name);
		
		
		for(int i = 0; i < name.length(); i++) {
			System.out.print(name.charAt(i));
		}
		System.out.println();
		
		byte[] bytes = name.getBytes();
		int start = 0;
		int end = bytes.length-1;
		for(int i = 0; i < bytes.length/2; i++) {
//			if(start < end) {
				byte temp = bytes[start];
				bytes[start] = bytes[end];
				bytes[end] = temp;
				start ++;
				end --;
//			} else {
//				break;
//			}
		}
		
		System.out.println(new String(bytes));
		Arrays.sort(bytes);
		System.out.println(new String(bytes));
	}


}
