package BFSCity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CreateGraph {

	Map<String, Node> graph;
	public ArrayList<String> path = new ArrayList<String>();
	ArrayList<String> sort=new ArrayList<String>();
	
	public CreateGraph()
	{
		graph=new HashMap<String, Node>();
	}

	
	public Map<String, Node> initializeMap()
	{
		
		addEdge("oradea","zerind",71);  addEdge("zerind","arad",75);
		addEdge("arad","timisoara",118);  addEdge("timisoara","lugoj",111);
		addEdge("lugoj","mehadia",70);  addEdge("dobreta","mehadia",75);
		addEdge("oradea","sibiu",151);  addEdge("arad","sibiu",140);
		addEdge("dobreta","craiova",120);  addEdge("sibiu","rimnicu_vilcea",80);
		addEdge("sibiu","fagaras",99);  addEdge("rimnicu_vilcea","craiova",146);
		addEdge("pitesti","craiova",138);  addEdge("rimnicu_vilcea","pitesti",97);
		addEdge("bucharest","pitesti",101);  addEdge("bucharest","fagaras", 211);
		addEdge("bucharest","giurgiu",90);  addEdge("bucharest","urziceni",85);
		addEdge("vaslui","urziceni",142);  addEdge("hirsova","urziceni",98);
		addEdge("hirsova","eforie",86);  addEdge("vaslui","iasi",92);
		addEdge("neamt","iasi",87);
		
		
		return graph;
	}

	public Node addNode(String name)
	{
		if (graph.get(name)==null)
		{
			Node node=new Node(name);
			graph.put(name, node);
		}
		return graph.get(name);	
	}
	
	public void addEdge(String source, String destination, Integer distance)
	{
		Node n1=addNode(source);
		Node n2=addNode(destination);

		n1.adj.add(n2);
		n2.adj.add(n1);
	}
	
}
