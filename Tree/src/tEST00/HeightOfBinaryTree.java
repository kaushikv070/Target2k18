package tEST00;

public class HeightOfBinaryTree extends Node {

	public static int checkHeight(Node node) {

		return (node == null ? 0 : (Math.max(checkHeight(node.right),
				checkHeight(node.left)) + 1));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HeightOfBinaryTree.root = new Node(4);
		HeightOfBinaryTree.root.left = new Node(2);
		HeightOfBinaryTree.root.right = new Node(5);
		HeightOfBinaryTree.root.left.right = new Node(1);
		HeightOfBinaryTree.root.left.left = new Node(3);
		HeightOfBinaryTree.root.right.left = new Node(4);
		HeightOfBinaryTree.root.right.left.right = new Node(5);
		System.out.println(checkHeight(root));

	}

}
