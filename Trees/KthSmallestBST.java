import java.io.*;
import java.util.*;

public class KthSmallestBST {
	
	private static int count=0;
	
	public void find(TreeNode root, int k){
		
		if(root==null) return;
		
		find(root.left, k);
		
		count++;
		if(count==k) System.out.println(root.data);
		
		find(root.right, k);

	}
}
