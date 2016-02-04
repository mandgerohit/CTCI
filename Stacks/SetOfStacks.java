import java.io.*;
import java.util.*;

public class SetOfStacks {
		
		ArrayList<StackSet> set=new ArrayList<StackSet>();
		int capacity;
		
		public SetOfStacks(int capacity){
			this.capacity=capacity;
			StackSet stack=new StackSet(this.capacity);
			set.add(stack);
		}
		
		public void push(int n){
			
			StackSet last=getLastStack();
			if(!last.isFull() && last!=null){
				last.push(n);
			}
			else{
				StackSet stack=new StackSet(capacity);
				stack.push(n);
				set.add(stack);
			}
		}
		
		public StackNode pop(){
			
			StackSet last=getLastStack();
			
			if(last!=null && last.peek()!=null){
				return last.pop();
			}
			else{
				set.remove(set.lastIndexOf(last));
				return getLastStack().pop();
			}
			
		}
		
		public StackSet getLastStack(){
			
			if(set.size()==0) return null;
			return set.get(set.size()-1);
			
		}
		
}

