import java.io.*;
import java.util.*;

public class SimpleStack{
	
	StackNode top;
	
	public SimpleStack() {
		StackNode top=null;
	}

	public void push(int n){
			StackNode node=new StackNode(n);
			node.next=top;
			top=node;
	}
	
	public StackNode pop(){
		
		if(this.peek()!=null){
			StackNode item=top;
			top=top.next;
			return item;
		}
		else{
			System.out.println("Stack is Empty");
			return null;
		}
	}
	
	public StackNode peek(){
		
		return top;
	}

}
