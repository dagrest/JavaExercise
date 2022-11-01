package Trees;

public class Node {
	public String data;
	public Node left;
	public Node right;
	
	Node(String data, Node left, Node right){
		this.data = data;
		this.left = left;
		this.right = right;
	}
	
	public void PreOrder() {
		PreOrder(this);
	}
	
	public void PreOrder(Node n) {
		if(n == null) {
			return;
		}
		
		System.out.print(n.data);
		PreOrder(n.left);
		PreOrder(n.right);
	}
	
	public void InOrder() {
		InOrder(this);
	}
	
	public void InOrder(Node n) {
		if(n == null) {
			return;
		}
		
		InOrder(n.left);
		System.out.print(n.data);
		InOrder(n.right);		
	}
	
	public void PostOrder() {
		PostOrder(this);
	}
	
	public void PostOrder(Node n) {
		if(n == null) {
			return;
		}
		
		PostOrder(n.left);
		PostOrder(n.right);		
		System.out.print(n.data);
	}
}
