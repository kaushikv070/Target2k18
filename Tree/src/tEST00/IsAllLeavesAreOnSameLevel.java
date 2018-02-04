package tEST00;

public class IsAllLeavesAreOnSameLevel extends Node {

	static int leafLevel=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int level=1;
		if(findIsAllLeavesAreOnSameLevel(new Node().constructTree(), level)){
			System.out.println("At same level");
		}else{
			System.out.println("Not at same level");
		}

	}
	public static boolean findIsAllLeavesAreOnSameLevel(Node node,int level ){
		if(node==null){
			return true;
		}
		else if(node.left==null && node.right==null){
			
			if(IsAllLeavesAreOnSameLevel.leafLevel==0){
				IsAllLeavesAreOnSameLevel.leafLevel=level;
				return true;
			}else{
				return(IsAllLeavesAreOnSameLevel.leafLevel==level);
			}
		}else{
			return findIsAllLeavesAreOnSameLevel(node.left, level+1) && findIsAllLeavesAreOnSameLevel(node.right, level+1);
		}
		
		
	}

}
