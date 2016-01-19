
public class CreateLinkedList {

	Node createList(){
		
		System.out.println("Creating a new LinkedList...");
		LinkedListOperations ls=new LinkedListOperations();
		int[] elements = {1,3,4,5,2,7,8,9,7,12,10};
		
		Node root=new Node();
		root.setData(String.valueOf(elements[0]));
		ls.setRoot(root);
		
		for (int i=1; i<=elements.length-1;i++){
		Node n=new Node();
		n.setData(String.valueOf(elements[i]));
		ls.addNode(n);
		}
		Node head=ls.getHead();
		return head;
	}
	
}
