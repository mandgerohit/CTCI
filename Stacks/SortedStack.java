import java.io.*;
import java.util.*;

public class SortedStack {
	
	SimpleStack s1;
	SimpleStack s2=new SimpleStack();
	
	public SortedStack(SimpleStack s1){
		
		this.s1=s1;
		
	}
	

	public SimpleStack sort(){
		
		s2.push(Integer.MIN_VALUE);
		
		while(s1.peek()!=null){
		
			StackNode s1Top=s1.pop();
					
			while(s2.peek().data>s1Top.data){
				
				s1.push(s2.pop().data);
				
			}
			
			s2.push(s1Top.data);
			//System.out.println(s2.peek().data);
		}
		
		return s2;
	}

}
