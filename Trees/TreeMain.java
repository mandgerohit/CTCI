import java.io.*;
import java.util.*;

public class TreeMain {

	// Taking Search Type, Source City and Destination as an input

	public static void main(String[] args) throws Exception
	{	
		int[] arr={1,2,3,5,6,8,9,10};
		BinaryTree bt=new BinaryTree();
		TreeNode root=bt.initializeBinaryTree(arr);
		//System.out.println(root.data);
		
		/* Minimal Binary Tree
		CreateMinimalBinaryTree ct=new CreateMinimalBinaryTree();
		TreeNode root=ct.initializeBinaryTree(arr);
		//System.out.println(root.data);
		*/
		
		/* Depth wise LinkedList
		ArrayList<LinkedList<TreeNode>> lt=new ArrayList<LinkedList<TreeNode>>();
		DepthLinkedList dll=new DepthLinkedList();
		lt=dll.initializeDepthLinkedList(root);
		
		for(int i=0;i<=lt.size()-1;i++){
			LinkedList<TreeNode> head=lt.get(i);
			System.out.println("\n");
			for(int j=0;j<=head.size()-1;j++)
			{
				System.out.print(head.get(j).data+" ");
			}
		}
		*/
		
		/*Check if given Binary Tree is a BST
		CheckBinarySearchTree bst=new CheckBinarySearchTree();
		if(bst.checkBST(root)) System.out.println("It is a BST");
		else System.out.println("It is NOT a BST");
		*/
		
	}
	
}