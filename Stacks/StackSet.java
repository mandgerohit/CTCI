import java.io.*;
import java.util.*;

public class StackSet{
	
	StackNode top=null;
	int capacity;
	int size=0;
	
	public StackSet(int capacity){
		this.capacity=capacity;
	}
	
	public void push(int n){
		StackNode node=new StackNode(n);
		node.next=top;
		top=node;
		this.size++;
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
	
	public boolean isFull(){
		
		if(this.size<this.capacity) return false;
		else return true;
		
	}

}