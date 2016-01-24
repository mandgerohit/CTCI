import java.io.*;
import java.util.*;

public class LinkedListOperations {

public Node headNode;
private int length;

public LinkedListOperations(){
	length=0;
}

public void setRoot(Node node){
	headNode=node;
	length=length+1;
}

public Node getHead(){
	return headNode;
}

public void addNode(Node node){

	Node q=headNode;
	while(q.next!=null)
		{
			q=q.next;
		}
	q.next=node;
	length++;
}

public void removeNode(Node node){
	if(headNode.data==node.data)
		{
			headNode=headNode.next;
		}
	else{
		Node q=headNode;
		while(q.next.data!=node.data){
			q=q.next;
		}
		q.next=node.next;
	}
}

public static void main(String args[]) throws IOException
{

	LinkedListOperations ls=new LinkedListOperations();
	
	Node n1=new Node();
	n1.setData(1);
	ls.setRoot(n1);
	
	Node n2=new Node();
	n2.setData(1);
	ls.addNode(n2);
	
	ls.removeNode(n1);
	
	Node head=ls.getHead();
	
	for(Node q=head; q!=null;q=q.next){
		System.out.println(q.data);
	}
}

}
