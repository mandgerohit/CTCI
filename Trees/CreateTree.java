import java.io.*;
import java.util.*;

public class CreateTree {
	
	TreeNode initializeBinaryTree(int[] arr){
		return CreateBinaryTree(arr, 0, arr.length-1);
	}

	TreeNode CreateBinaryTree(int[] a, int start, int end){
		
		if(start>end){
			return null;
		}
		
		else{
		int mid=(start+end)/2;
		TreeNode n=new TreeNode(a[mid]);
		
		n.left=CreateBinaryTree(a, start, mid-1);
		n.right=CreateBinaryTree(a, mid+1, end);
		return n;
		}
	}
	
}
