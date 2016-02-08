import java.io.*;
import java.util.*;

public class CloneRandom {
	
	Map<Node, Node> set=new HashMap<Node, Node>();
	public void cloneList(Node head){
		
		Node clone=null;
		Node orig=head;
		while(orig!=null){
			
			clone=new Node(orig.data);
			set.put(orig, clone);
			orig=orig.next;
		}
		
		orig=head;
		
		while(orig!=null){
			
			clone=set.get(orig);
			clone.next=set.get(orig.next);
			clone.random=set.get(orig.random);
			orig=orig.next;
		}	
	}
	
	public static void main()throws IOException{
		
		CloneRandom cr=new CloneRandom();
		LinkedListOperations lo=new LinkedListOperations();
		Node n1=new Node(2);
		Node n2=new Node(3);
		Node n3=new Node(1);
		Node n4=new Node(5);
		Node n5=new Node(4);
		
		lo.setRoot(n1);
		n1.setNext(n2);
		n2.setNext(n3);
		n3.setNext(n4);
		n4.setNext(n5);
		
		n1.setRandom(n3);
		n2.setRandom(n5);
		n4.setRandom(n1);
	}
	
	
}
