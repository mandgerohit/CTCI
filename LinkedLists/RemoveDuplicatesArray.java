import java.io.IOException;
import java.util.*;

public class RemoveDuplicatesArray {
	
	void removeDups(Node head){
		
		boolean[] dup=new boolean[50];
		Node previous=null;
		Node n =head;
		Arrays.fill(dup, false);
		
		while(n!=null){
			
			if(dup[n.data]==true){
				previous.next=n.next;
			}
			else{
				dup[n.data]=true;
				previous=n;
			}
		n=n.next;
		}
	}
}
