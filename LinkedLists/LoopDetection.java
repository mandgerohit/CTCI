import java.io.*;
import java.util.*;

public class LoopDetection {

	ArrayList<Node> list=new ArrayList<Node>();
	
	void detectLoop(Node head){
		
		while(head!=null){
			
			if(list.contains(head)){
				System.out.println(head.data);
				return;
			}
			else{
				list.add(head);
				head=head.next;
			}		
		}
	System.out.println("No Loop found");
	}
	
}
