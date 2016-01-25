import java.io.*;
import java.util.*;

public class BuildOrder {

	Map<String, GraphNode> graph;
	Queue<GraphNode> q=new LinkedList<GraphNode>();
	
	
	public BuildOrder()
	{
		graph=new HashMap<String, GraphNode>();
	}

	public ArrayList<GraphNode> getSuccessors(GraphNode n)
	{
		ArrayList<GraphNode> list= new ArrayList<GraphNode>();

		int length=n.adj.size();
		for (int i=0;i<=length-1;i++)
		{
			list.add(n.adj.get(i));
		}
		return list;
	}
	
	public void initializeMap(String[] arr, String[][] dep)
	{
		ArrayList<GraphNode> path=new ArrayList<GraphNode>();
		ArrayList<GraphNode> deplist= new ArrayList<GraphNode>();
		
		for (int i=0;i<=arr.length-1;i++) {
			addGraphNode(arr[i]);
		}
		
		for (int i=0;i<=dep.length-1;i++) {
			addEdge(graph.get(dep[i][0]), graph.get(dep[i][1]));
		}
		
		for(int j=0; j<=dep.length-1;j++)
			deplist.add(graph.get(dep[j][0]));

		for(int i=0; i<=arr.length-1;i++){
			if(!deplist.contains(graph.get(arr[i]))){
				q.add(graph.get(arr[i]));
			}
		}

		
		while(!q.isEmpty()){
			GraphNode x=q.poll();
			System.out.println(x.name);
			
			path=getSuccessors(x);
			
			for(int i=0;i<=path.size()-1;i++){
				
				if(!q.contains(path.get(i))){
					q.add(path.get(i));
					//System.out.print(path.get(i).name+" ");
				}
			}
			//System.out.print("\n");
		}
		
	}

	public GraphNode addGraphNode(String name)
	{
		if (graph.get(name)==null)
		{
			GraphNode node=new GraphNode(name);
			graph.put(name, node);
		}
		return graph.get(name);	
	}
	
	public void addEdge(GraphNode node1, GraphNode node2)
	{
		node2.adj.add(node1);
	}
}
