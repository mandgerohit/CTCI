import java.io.*;
import java.util.*;

public class CreateLinkedList {
	LinkedListOperations ls=new LinkedListOperations();
	
	Node createList(int[] elements){
		
		//System.out.println("Creating a new LinkedList...");
		
		Node root=new Node(elements[0]);
		root.setData(elements[0]);
		ls.setRoot(root);
		
		for (int i=1; i<=elements.length-1;i++){
			Node n=new Node(elements[1]);
			n.setData(elements[i]);
			ls.addNode(n);
		}
		Node head=ls.getHead();
		/*To create a looping element
		ls.addNode(head.next);
		*/
		return head;
	}
	
}
