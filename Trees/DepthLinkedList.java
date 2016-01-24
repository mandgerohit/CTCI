import java.io.*;
import java.util.*;

public class DepthLinkedList {

	ArrayList<LinkedList<TreeNode>> initializeDepthLinkedList(TreeNode root) {
		
		ArrayList<LinkedList<TreeNode>> lists= new ArrayList<LinkedList<TreeNode>>();
		createDepthLinkedList(lists, root, 0);
		return lists;
	}
	
	public void createDepthLinkedList(ArrayList<LinkedList<TreeNode>> lists, TreeNode root, int level){
		
		if(root==null) return;
		
		LinkedList<TreeNode> list=null;

		if(lists.size()==level){
			
			list=new LinkedList<TreeNode>();
			lists.add(list);
		}
		else{
			
			list=lists.get(level);
		}
		
		list.add(root);
		
		createDepthLinkedList(lists, root.left, level+1);
		createDepthLinkedList(lists, root.right, level+1);
		
	}
	
}
