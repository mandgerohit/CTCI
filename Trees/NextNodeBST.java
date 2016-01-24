import java.io.*;
import java.util.*;

public class NextNodeBST {

	TreeNode nextNode(TreeNode n){
		
		if(n==null) return null;
		
		if(n.right!=null){
			return findLeftMostChild(n.right);
		}
		else{
			TreeNode temp=n;
			TreeNode x=temp.parent;
				while(x!=null && x.left!=temp){
					temp=x;
					x=x.parent;
				}
				return x;
			}
	}
	public TreeNode findLeftMostChild(TreeNode n){
		
		if(n==null) return null;
		
		while(n.left!=null){
			n=n.left;
		}
		return n;
	}
}
