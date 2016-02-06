import java.io.*;
import java.util.*;

public class Partition {
	
	Node partitionList(Node head, Integer k){
		
		Node current;
		Node runner;
		current=runner=head;
		
		while(runner!=null){
			
			if(runner.data<k){
				int temp=runner.data;
				runner.data = current.data;
				current.data = temp;
				
				current=current.next;
			}
			runner=runner.next;
		}
		return head;
	}

}
