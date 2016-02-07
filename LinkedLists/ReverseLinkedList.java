import java.io.*;
import java.util.*;

public class ReverseLinkedList{

	private Node reverseHead=null;
	private LinkedList<Integer> list=new LinkedList<Integer>();
	
	public Node reverseLink(Node head){
		
		reverse(head);
		return reverseHead;
		
	}

	public Node reverse(Node head){
	
		if(head==null) return null;
	
		Node n=reverse(head.next);
		
		Node cloneHead=head;

		if(n==null){
			reverseHead=cloneHead;
			cloneHead.next=null;
		}
		else{
			n.next=cloneHead;
					
		}
		return cloneHead;
						
	}
	
	public static void main(String[] args) throws IOException{
	
		int[] a = {2,3,1,5,4,7};
		CreateLinkedList cl=new CreateLinkedList();	
		Node root= cl.createList(a);
		
		ReverseLinkedList r=new ReverseLinkedList();
		System.out.println(r.reverseLink(root).data);
		
	}
}
