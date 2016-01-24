package BFSCity;
import java.util.*;

public class TreeMain {

	// Taking Search Type, Source City and Destination as an input
	
	public static void main(String[] args) throws Exception
	{		
		CreateGraph cg=new CreateGraph();
		BreadthFirstSearch b=new BreadthFirstSearch();
		Map<String, TreeNode> graph;
		
		graph = cg.initializeMap();
		b.bfs(graph, "arad", "pitesti");
		System.out.println("pitesti"+"\n");
	}
	
}