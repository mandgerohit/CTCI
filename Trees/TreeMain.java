import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class TreeMain {

	// Taking Search Type, Source City and Destination as an input

	@SuppressWarnings("null")
	public static void main(String[] args) throws Exception
	{	
		int[] arr={1};
		
		/*Binary Tree
		BinaryTree bt=new BinaryTree();
		TreeNode root=bt.initializeBinaryTree(arr);
		System.out.println(root.data);
		*/
		
		/* Binary Search Tree
		BinarySearchTree bst=new BinarySearchTree();
		TreeNode r=bst.initializeBinaryTree(arr);
		//System.out.println(r.data);
		if(bst.removeNode(r)) {
			System.out.println("Node removed successfully");
		}
		else{
			System.out.println("Node NOT removed successfully");
		}
		//System.out.println(r.left.data);
		if(bst.addNode(null, new TreeNode(4))) {
			System.out.println("Node added successfully");
		}
		else{
			System.out.println("Node NOT added successfully");
		}
		System.out.println(r.data);
		*/
		
		/*Kth Smallest Element in BST
		BinarySearchTree bst=new BinarySearchTree();
		TreeNode r=bst.initializeBinaryTree(arr);
		KthSmallestBST k=new KthSmallestBST();
		k.find(r, 3);
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
		
		/*Next Node in BST
		NextNodeBST next=new NextNodeBST();
		TreeNode n=next.nextNode(root.left);
		System.out.println(n.data);
		*/
		
		/*Build Order, topological Sort
		BuildOrder b=new BuildOrder();

		String[] nodearr={"a", "b", "c", "d", "e", "f"};
		String dep[][]={
		{"d", "a"},
		{"b", "f"}, 
		{"d", "b"}, 
		{"a", "f"}, 
		{"c", "d"}};	
		b.initializeMap(nodearr, dep);	
		*/
		
		/*Common Ancestor
		CommonAncestor ca=new CommonAncestor();
		TreeNode ancestor=ca.findAncestor(root, root.left, root.right.left);
		System.out.println(ancestor.data);
		*/
	}
	
}