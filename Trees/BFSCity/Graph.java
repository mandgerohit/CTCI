package BFSCity;
import java.util.*;

public class Graph 
{	
	//BreadthFirstSearch b=new BreadthFirstSearch();
	
	public TreeNode initializeQueue(Map<String, TreeNode> graph, String src)
	{
		TreeNode root=graph.get(src);
		return root;
	}
	
	public TreeNode initializeStack(Map<String, TreeNode> graph, String src)
	{
		TreeNode root=graph.get(src);
		return root;
	}
	
	public ArrayList<TreeNode> getSuccessors(TreeNode n)
	{
		ArrayList<TreeNode> list= new ArrayList<TreeNode>();

		int length=n.adj.size();
		for (int i=0;i<=length-1;i++)
		{
			list.add(n.adj.get(i));
		}
		return list;
	}
}