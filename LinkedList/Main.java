import java.io.IOException;

public class Main {

	public static void main(String args[]) throws IOException
	{
		Main m = new Main();
		CreateLinkedList cll= new CreateLinkedList();
		Node head=cll.createList();
		
		/* Remove Duplicate elements from the LinkedList
		RemoveDuplicates rd=new RemoveDuplicates();
		rd.removeDups(head);
		*/
		
		/* Find Kth element to the last
		KthElementToLast kth = new KthElementToLast();
		Node n=kth.kthToLast(head, 10);	
		if(n!=null){
		System.out.println("Kth Element to last is: "+n.data);
		}
		else{
			System.out.println("Kth element doesnt exist");
		}
		*/
		
		/*Delete middle element of singly linkedList
		DeleteMiddleElement dme=new DeleteMiddleElement();
		dme.deleteMiddle(head);
		*/
		
		/*Partitioning the elements
		Partition p=new Partition();
		p.partitionList(head,4);		
		*/
		
		m.print(head);
}
	void print (Node head){
		
		for(Node q=head; q!=null;q=q.next){
			System.out.println(q.data);
		}
	}
}
