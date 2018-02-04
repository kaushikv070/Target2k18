package tEST00;


public class OddEvenLevelDifference extends Node{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OddEvenLevelDifference.root=new Node(4);
		OddEvenLevelDifference.root.left=new Node(2);
		OddEvenLevelDifference.root.right=new Node(5);
		
		System.out.println(getLevelDifference(root));
		

	}
	public static int getLevelDifference(Node node){
		
		int diff;
		if(node==null){
			return 0;
		}else{
			 diff=node.key-getLevelDifference(node.left)- getLevelDifference(node.right);
			
		}
		return diff;
	}
	

}
