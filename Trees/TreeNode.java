
public class TreeNode {
	
	int data;
	TreeNode left;
	TreeNode right;
	TreeNode parent;
	
	public TreeNode(int data, TreeNode parent){
		left=null;
		right=null;
		this.parent=parent;
		this.data=data;
	}
	
	public TreeNode(int data){
		left=null;
		right=null;
		this.data=data;
	}
}
