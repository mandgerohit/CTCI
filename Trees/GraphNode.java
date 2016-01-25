import java.util.ArrayList;

public class GraphNode {

	String name;
	
	public ArrayList<GraphNode> adj; 
	
	GraphNode(String name)
	{
		this.name=name;
		adj=new ArrayList<GraphNode>();
	}
}