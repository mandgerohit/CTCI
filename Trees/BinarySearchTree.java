import java.io.*;
import java.util.*;

public class BinarySearchTree {
	
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
	
	public boolean addNode(TreeNode root, TreeNode n){
		
		if(root==null) {
			addNode(n, n);
			return true;
		}
		
		if(n.data<root.data){
			if(!addNode(root.left, n)){
				root.left=n;
				n.parent=root;
			}
			return true;
		}
		
		if(n.data>root.data){
			if(!addNode(root.right, n)){
				root.right=n;
				n.parent=root;
			}
			return true;
		}
		
		return true;
	}
	
	public boolean removeNode(TreeNode n){
		
		if(n==null) return false;
		
		if(n.left==null && n.right==null){
			
			if(n.parent==null){
				n=null;
				return true;
			}
			else{
				if(n==n.parent.left) n.parent.left=null;
				if(n==n.parent.right) n.parent.right=null;
				return true;
			}
		}
		
		if(n.left!=null && n.right==null){
			
			TreeNode x=n.parent;
			
			if(x==null){
				n.left.parent=null;
				return true;
			}
			
			if(n==x.left){
				x.left=n.left; return true;
			}
			
			if(n==x.right){
				x.right=n.left;	return true;
			}

		}
		
		if(n.left==null && n.right!=null){
			
			TreeNode x=n.parent;
			if(x==null){
				n.right.parent=null;
				return true;
			}
			
			if(n==x.left){
				x.left=n.right;	return true;
			}
			
			if(n==x.right){
				x.right=n.right; return true;
			}	
		}
		
		if(n.right!=null && n.left!=null){
			
			TreeNode temp=findLeftMostChild(n.right);
			//System.out.println(temp.data);
			if(temp!=n.right){
				n.data=temp.data;
				temp.parent.left=null; 
				return true;
			}
			
			TreeNode x=n.parent;
			if(x==null){
				n.data=n.right.data;
				n.right=null;
				return true;
			}
			
			if(n==x.right){
				x.right=n.right;
				n.right.left=n.left; return true;
			}
			
			if(n==x.left){
				x.left=n.right;
				n.right.left=n.left; return true;
			}
			
			
		}
		
		return false;
	}
	
	public TreeNode findLeftMostChild(TreeNode n){
		
		if(n==null) return null;
		
		while(n.left!=null){
			n=n.left;
		}
		return n;
	}
	
}
