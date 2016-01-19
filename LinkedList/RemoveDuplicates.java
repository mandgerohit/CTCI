import java.io.IOException;
import java.util.*;

public class RemoveDuplicates {
	
	void removeDups(Node head){
		
		HashSet<String> set = new HashSet<String>();
		Node previous=null;
		Node n =head;
		
		while(n!=null){
			
			if(set.contains(n.data)){
				previous.next=n.next;
			}
			else{
				set.add(n.data);
				previous=n;
			}
		n=n.next;
		}
	}
}
