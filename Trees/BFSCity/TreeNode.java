package BFSCity;
import java.util.*;

public class TreeNode {

	String name;
	boolean isvisited=false;
	
	public ArrayList<TreeNode> adj; 
	
	TreeNode(String name)
	{
		this.name=name;
		adj=new ArrayList<TreeNode>();
	}
}