import java.io.IOException;

public class Main {

	public static void main(String args[]) throws IOException
	{
		int[] a = {2,3,1,5,4,7};
		Main m = new Main();
		CreateLinkedList cll= new CreateLinkedList();
		Node head=cll.createList(a);

		/* Remove Duplicate elements from the LinkedList
		RemoveDuplicates rd=new RemoveDuplicates();
		rd.removeDups(head);
		*/
		
		/* Find Kth element to the last
		KthElementToLast kth = new KthElementToLast();
		KthElementToLastRecursive kthrec = new KthElementToLastRecursive();
		//Node n=kth.kthToLast(head, 7);
		Node n=kthrec.kthToLast(head, 4);	
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
		m.print(p.partitionList(head,4));
		*/
		
		/*Sum Lists problem, i.e. addition of two numbers in the form of linked list
		 SumLists sm= new SumLists();
		 Node sumHead=sm.sumListInit();
		 m.print(sumHead);
		*/
		
		/*Palindrome problem in LinkedList
		 Palindrome pl=new Palindrome();
		 pl.testPalindrome(head);
		 
		 PalindromeStack p=new PalindromeStack();
		 p.testPalindrome(head);
		 */
		
		/*Loop detection in LinkedList where an element appears twice
		LoopDetection ld = new LoopDetection();
		ld.detectLoop(head);
		*/
		
		//m.print(head);
}
	void print (Node head){
		
		for(Node q=head; q!=null;q=q.next){
			System.out.println(q.data);
		}
	}
}
