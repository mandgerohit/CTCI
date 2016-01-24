import java.io.*;
import java.util.*;

public class TreeMain {

	// Taking Search Type, Source City and Destination as an input
	CreateTree ct=new CreateTree();
	public static void main(String[] args) throws Exception
	{		
		CreateTree ct=new CreateTree();
		int[] arr={1,2,3,5,6,8,9,10};
		
		TreeNode root=ct.initializeBinaryTree(arr);
		//System.out.println(root.data);
		
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
		
	}
	
}