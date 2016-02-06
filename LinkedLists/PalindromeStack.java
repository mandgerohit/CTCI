import java.io.*;
import java.util.*;

public class PalindromeStack {
	
	
	Stack<Node> stack=new Stack<Node>();
	
	void testPalindrome(Node head){
			
			if(checkPalindrome(head))
				 System.out.println("Palindrome");
			else
				 System.out.println("Not a Palindrome");
	}
	
	public boolean checkPalindrome(Node head){
		
		Node current=head;
		Node runner=head;
		
		while(runner.next!=null){
			
			stack.push(current);
			current=current.next;
			runner=runner.next.next;	
		}
		
		if(runner!=null){	
			current=current.next;
		}
		
		while(current!=null && !stack.isEmpty()){
			
			if(current.data!=stack.pop().data){
				return false;
			}
			current=current.next;
		}
		
		return true;
	}
}
