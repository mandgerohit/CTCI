import java.io.*;
import java.util.*;

public class Palindrome {

	ArrayList<Integer> arr = new ArrayList<Integer>();
	//CreateLinkedList cll= new CreateLinkedList();
	
	void testPalindrome(Node head){
		
		palindromeList(head);
		
		if(checkPalindrome())
			 System.out.println("Palindrome");
		else
			 System.out.println("Not a Palindrome");
	}
	
	void palindromeList(Node head){
		
		if(head==null) return;
		
		palindromeList(head.next);
		
		arr.add(head.data);
		
		//System.out.println(arr);
	}
	
	boolean checkPalindrome(){
		
		int front=0;
		int back=arr.size()-1;
		
		while(front<=back){
			if (!arr.get(front).equals(arr.get(back))){
				return false;
			}
			front++;
			back--;
		}
		return true;
	}
}
