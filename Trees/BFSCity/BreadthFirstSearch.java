package BFSCity;
import java.io.*;
import java.util.*;

public class BreadthFirstSearch{
	
	Graph g=new Graph();
	Queue<TreeNode> q=new LinkedList<TreeNode>();
	ArrayList<TreeNode> path=new ArrayList<TreeNode>();
	ArrayList<String> sort=new ArrayList<String>();
	
	public void bfs(Map<String, TreeNode> graph, String src, String dest)
	{
	TreeNode root=g.initializeQueue(graph, src);	
	q.add(root);
	root.isvisited=true;
	System.out.print(root.name+"-->");
	
	while(!q.isEmpty())
	{
		TreeNode head=q.poll();

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
