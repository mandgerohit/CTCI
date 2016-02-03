import java.io.*;
import java.util.*;

public class SimpleStack implements Stack{
	
	StackNode top=null;
	
	public void push(int n){
		
		StackNode node=new StackNode(n);
		node.next=top;
		top=node;
	}
	
	public StackNode pop(){
		
		StackNode item=top;
		top=top.next;
		return item;
	}
	
	public StackNode peek(){
		
		return top;
	}

}
