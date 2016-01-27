import java.util.*;

public class CommonAncestor {

	TreeNode findAncestor(TreeNode root, TreeNode a, TreeNode b){
		
		if(root==null) return null;
		
		if(root==a && root==b) return root;
		
		TreeNode left=findAncestor(root.left, a, b);
		if(left!=null && left!=a && left!=b) return left;
		
		TreeNode right=findAncestor(root.right, a, b);
		if(right!=null && right!=a && right!=b) return right;
		
		if(left!=null && right!=null) return root;
		else{
			if(root==a || root==b) return root;
			else{
				return left==null? right:left;
			}
		}
	}
	
}
