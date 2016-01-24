import java.util.*;

public class BinaryTree {

	TreeNode initializeBinaryTree(int[] arr){
		return CreateBinaryTree(arr, 1);
	}

	TreeNode CreateBinaryTree(int[] a, int index){
		
		if(index>a.length){
			return null;
		}
		
		else{
		TreeNode n=new TreeNode(a[index-1]);
		
		n.left=CreateBinaryTree(a, index*2);
		n.right=CreateBinaryTree(a, index*2+1);
		return n;
		}
	}
	
}
