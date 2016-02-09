import java.io.*;
import java.util.*;

public class MyQueue {
	
	SimpleStack oldStack=new SimpleStack();
	SimpleStack newStack=new SimpleStack();
	
	public void add(int n){
		
		oldStack.push(n);
	}

	public StackNode remove(){
	
		if(newStack.peek()!=null){
			return newStack.pop();
		}
		else{
			if(oldStack.peek()==null){
				System.out.println("Queue is Empty");
				throw new EmptyStackException();
			}
			else{
				while(oldStack.top!=null){
					newStack.push(oldStack.pop().data);
				}
				return newStack.pop();
			}

		}

	}
	
}
