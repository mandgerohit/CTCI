import java.io.*;
import java.util.*;

public class CreateLinkedList {

	Node createList(){
		
		System.out.println("Creating a new LinkedList...");
		LinkedListOperations ls=new LinkedListOperations();
		int[] elements = {3,5,8,5,10,2,1};
		
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
