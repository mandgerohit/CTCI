import java.io.IOException;
import java.util.*;

public class SumLists {
	
	LinkedListOperations ls=new LinkedListOperations();
	CreateLinkedList cll= new CreateLinkedList();
	
	Node sumListInit(){
		 int[] num1 = {7,1,6};
		 int[] num2 = {5,9,2};
		 Node head1=cll.createList(num1);
		 Node head2=cll.createList(num2);
		 int total1=getSum(head1);
		 int total2=getSum(head2);
		 Node sumHead=sum(total1, total2);
		 return sumHead;
	}
	
	Node sum(int sum1, int sum2){	
		int total=sum1+sum2;
		int rem;
		rem=total%10;
		Node root=new Node(rem);
		root.setData(rem);
		ls.setRoot(root);
		total=total/10;
		while(total!=0){	
			rem=total%10;
			Node n=new Node(rem);
			n.setData(rem);
			ls.addNode(n);
			total=total/10;
		}
		
		Node head=ls.getHead();
		return head;
	}
	
	int getSum(Node n){
		int i=1;
		int sum=0;
		while (n!=null){
			sum=sum+n.data*i;
			i=i*10;
			n=n.next;
		}
		return sum;
	}
	
}
