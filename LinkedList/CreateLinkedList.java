import java.io.*;
import java.util.*;

public class CreateLinkedList {
	LinkedListOperations ls=new LinkedListOperations();
	
	Node createList(int[] elements){
		
		//System.out.println("Creating a new LinkedList...");
		
		Node root=new Node();
		root.setData(elements[0]);
		ls.setRoot(root);
		
		for (int i=1; i<=elements.length-1;i++){
		Node n=new Node();
		n.setData(elements[i]);
		ls.addNode(n);
		}
		Node head=ls.getHead();
		return head;
	}
	
}
