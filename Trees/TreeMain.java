import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class TreeMain {

	// Taking Search Type, Source City and Destination as an input

	@SuppressWarnings("null")
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