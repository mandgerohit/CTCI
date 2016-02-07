import java.io.*;
import java.util.*;

public class CreateBST {
	
	TreeNode initializeBinaryTree(int[] arr){
		return CreateBinaryTree(arr, 0, arr.length-1, null);
	}

	TreeNode CreateBinaryTree(int[] a, int start, int end, TreeNode parent){
		
		if(start>end){
			return null;
		}
		
		else{
		int mid=(start+end)/2;
		TreeNode n=new TreeNode(a[mid], parent);
		
		n.left=CreateBinaryTree(a, start, mid-1, n);
		n.right=CreateBinaryTree(a, mid+1, end, n);
		return n;
		}
	}
	
}
