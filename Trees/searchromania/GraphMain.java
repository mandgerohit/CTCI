package searchromania;
import java.util.*;

public class GraphMain {

	// Taking Search Type, Source City and Destination as an input
	
	public static void main(String[] args) throws Exception
	{		
		CreateGraph cg=new CreateGraph();
		BreadthFirstSearch b=new BreadthFirstSearch();
		Map<String, Node> graph;
		
		graph = cg.initializeMap();
		b.bfs(graph, "arad", "pitesti");
		System.out.println("pitesti"+"\n");
	}
	
}