package searchromania;
import java.io.*;
import java.util.*;

public class BreadthFirstSearch{
	
	Graph g=new Graph();
	Queue<Node> q=new LinkedList<Node>();
	ArrayList<Node> path=new ArrayList<Node>();
	ArrayList<String> sort=new ArrayList<String>();
	
	public void bfs(Map<String, Node> graph, String src, String dest)
	{
	Node root=g.initializeQueue(graph, src);	
	q.add(root);
	root.isvisited=true;
	System.out.print(root.name+"-->");
	
	while(!q.isEmpty())
	{
		Node head=q.poll();

		if (head.name.contains(dest))
		{
			System.out.println(head.name+"\n");
			break;
		}
		
		else
		{
			path=g.getSuccessors(head);
		
			for (int i=0;i<=path.size()-1;i++)
			{	
				sort.add(path.get(i).name);
			}
			
			Collections.sort(sort);
			
			for (int i=0;i<=path.size()-1;i++)
			{
				String name=sort.get(i);
				
				if (graph.get(name).isvisited==false)
				{
					if (!graph.get(name).name.contains(dest))
					{
					q.add(graph.get(name));
					System.out.print(name+"-->");
					graph.get(name).isvisited=true;
					}
					else
					{
						return;
					}
				}
			}
			
			sort.clear();
		}
	}
	return;
	
	}
	
}
