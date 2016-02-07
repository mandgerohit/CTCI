package searchromania;
import java.io.*;
import java.util.*;

public class DepthFirstSearch {
	
	Graph g=new Graph();
	Stack<Node> s=new Stack<Node>();
	ArrayList<Node> path=new ArrayList<Node>();
	ArrayList<String> sort=new ArrayList<String>();
	
	public void dfs(Map<String, Node> graph, String src, String dest)
	{
		Node root=g.initializeStack(graph, src);
		
		s.push(root);
		root.isvisited=true;
		
		while(!s.isEmpty())
		{
			Node head=s.pop();
			
			head.isvisited=true;
			
			if (head.name.contains(dest))
			{
				System.out.print(head.name+"\n");
				break;
			}
			
			else
			{
				System.out.print(head.name+"-->");
				path=g.getSuccessors(head);
			
				for (int i=0;i<=path.size()-1;i++)
				{
			
					sort.add(path.get(i).name);
				}
				
				Collections.sort(sort);
				Collections.reverse(sort);
				
				for (int i=0;i<=path.size()-1;i++)
				{
					String name=sort.get(i);
					
					if (graph.get(name).isvisited==false)
					{
						s.push(graph.get(name));
					}
				}
				
				sort.clear();
			}
		}
		return;	
	}
	

}
