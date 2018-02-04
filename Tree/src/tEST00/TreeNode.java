package tEST00;

public class TreeNode {

	
	
	
}
 class Node
 {
	static Node root = null;
	static Node prev = null;
	int key;
	Node left, right;

	Node() {

	}

	public Node(int item) {
		key = item;
		left = right = null;

	}
	
	public Node constructTree(){
		
		Node.root = new Node(4);
		Node.root.left = new Node(2);
		Node.root.right = new Node(5);
		Node.root.left.right = new Node(1);
		Node.root.left.left = new Node(3);
		Node.root.right.left = new Node(4);
		Node.root.right.left.right = new Node(5);
		return root;
	}
}