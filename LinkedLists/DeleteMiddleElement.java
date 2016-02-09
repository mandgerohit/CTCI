
public class DeleteMiddleElement {

	void deleteMiddle(Node head){
		
		Node current;
		Node runner;
		current=head;
		runner=current.next.next;
	
		while(runner.next!=null){		
			runner=runner.next.next;
			current=current.next;
		}
			current.next=current.next.next;
	}
	
}
