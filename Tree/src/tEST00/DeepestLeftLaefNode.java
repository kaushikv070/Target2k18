package tEST00;

public class DeepestLeftLaefNode extends Node {
	 
	static int maxKey=0;
	static int maxLevel=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int level=1;
		System.out.println(FindDeepestLeafNode(new Node().constructTree(), level, false));

	}
	public static int FindDeepestLeafNode(Node node,int level,boolean isLeft){
		
		if(node==null){
			return 0;
		}
		else if(node.left==null && node.right==null && isLeft && level>maxLevel){
		
			maxLevel=level;
			maxKey=node.key;
			
		}else{
			FindDeepestLeafNode(node.left,level+1,true);
			FindDeepestLeafNode(node.right, level+1,false);
			
		}
		return maxKey;
	}
	

}
