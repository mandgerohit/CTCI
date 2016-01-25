package BFSCity;
import java.util.*;

class Node {

	String name;
	boolean isvisited=false;
	
	public ArrayList<Node> adj; 
	
	Node(String name)
	{
		this.name=name;
		adj=new ArrayList<Node>();
	}
}