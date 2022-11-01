package Trees;

public class MainProgram {

	public static void main(String[] args) {
		
		Node n6 = new Node("6", null, null);
		Node n5 = new Node("5", null, null);
		Node n4 = new Node("4", null, null);
		Node n3 = new Node("3", null, null);
		Node n2 = new Node("-", n5, n6);
		Node n1 = new Node("+", n3, n4);
		Node n0 = new Node("*", n1, n2);
		
		System.out.println("PreOrder:");
		n0.PreOrder();
		System.out.println("\n");
		
		System.out.println("InOrder:");
		n0.InOrder();
		System.out.println("\n");

		System.out.println("PostOrder");
		n0.PostOrder();
		System.out.println("\n");

	}

}
