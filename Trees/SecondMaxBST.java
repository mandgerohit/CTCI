import java.io.*;

public class SecondMaxBST {
	
	int count=0;
	TreeNode node=null;
	
	public TreeNode getSecondMax(TreeNode head){
		
		find(head);
		return node;
	}
	
	public void find(TreeNode root){
		
		
		if(root==null) return;
		
		find(root.right);
		count++;
		
		if(count==2) node=root;
		
		return;
	}
	
	public static void main(String[] args)throws IOException{
		
		SecondMaxBST s=new SecondMaxBST();
		int[] arr={1,2,3,4,5,6,7,8};
		BinarySearchTree bst=new BinarySearchTree();
		TreeNode r=bst.initializeBinaryTree(arr);
		TreeNode n=s.getSecondMax(r);
		System.out.println(n.data);
		
	}

}
