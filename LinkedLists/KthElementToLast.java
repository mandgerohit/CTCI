import java.io.*;

public class KthElementToLast {

	Node kthToLast(Node head, Integer k){
		
		Node n= head;
		int i=0;
		while(n!=null){
			i=i+1;
			n=n.next;
		}
		if(k>i){
			return null;
		}
		else{
		n=head;
		for(int j=0;j<=i-k-1;j++){
			n=n.next;
		}
		
		return n;
	}
	}
}
