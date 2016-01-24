import java.io.*;
import java.util.*;

public class CheckBinarySearchTree {

	Integer last_value=null;
	
	public boolean checkBST(TreeNode root){
		
		if(root==null) return true;
		
		if(!checkBST(root.left)) return false;
		
		if(last_value!=null && root.data<=last_value) return false;
		
		last_value=root.data;
		
		if(!checkBST(root.right)) return false;
		
		return true;
		
	}
}
