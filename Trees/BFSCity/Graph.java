package BFSCity;
import java.util.*;

public class Graph 
{	
	//BreadthFirstSearch b=new BreadthFirstSearch();
	
	public Node initializeQueue(Map<String, Node> graph, String src)
	{
		Node root=graph.get(src);
		return root;
	}
	
	public Node initializeStack(Map<String, Node> graph, String src)
	{
		Node root=graph.get(src);
		return root;
	}
	
	public ArrayList<Node> getSuccessors(Node n)
	{
		ArrayList<Node> list= new ArrayList<Node>();

		int length=n.adj.size();
		for (int i=0;i<=length-1;i++)
		{
			list.add(n.adj.get(i));
		}
		return list;
	}
}