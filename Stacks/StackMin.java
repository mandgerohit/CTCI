import java.io.*;
import java.util.*;

public class StackMin {
	
StackNode top=null;
SimpleStack s1=new SimpleStack();
SimpleStack s2=new SimpleStack();
	
	public void push(int n){
		
		if(n<=min()){
			s2.push(n);
		}
		s1.push(n);
		
	}
	
	public StackNode pop(){
		
		if(s1.top.data==s2.top.data){
			s2.pop();
		}
		return s1.pop();

	}
	
	public int min(){
		
		if(s2.peek()==null){
			return Integer.MAX_VALUE;
		}
		else{
			return s2.peek().data;
		}
		
	}
}
