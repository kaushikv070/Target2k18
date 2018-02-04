package tEST00;

public class DeepestOddLevelLeaf extends Node {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int level=1;
		System.out.println(findDeepestOddLevel(new Node().constructTree(),level));
		

	}
	public static int findDeepestOddLevel(Node node,int level){
		
		if(node==null){
			return 0;
		}
		else if(node.left==null && node.right==null && (level&1)!=0){
			return level;
		}else{
			return Math.max(findDeepestOddLevel(node.left, level+1),findDeepestOddLevel(node.right, level+1));
		}
		
	}

}
