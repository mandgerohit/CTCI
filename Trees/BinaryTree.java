import java.util.*;

public class BinaryTree {

	TreeNode initializeBinaryTree(int[] arr){
		return CreateBinaryTree(arr, 1, null);
	}

	TreeNode CreateBinaryTree(int[] a, int index, TreeNode parent){
		
		if(index>a.length){
			return null;
		}
		
		else{
			
			TreeNode n=new TreeNode(a[index-1], parent);
			n.left=CreateBinaryTree(a, index*2, n);
			n.right=CreateBinaryTree(a, index*2+1, n);
			return n;
		}
	}
	
}
