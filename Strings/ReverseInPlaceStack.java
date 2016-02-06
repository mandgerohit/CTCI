import java.io.*;
import java.util.*;

public class ReverseInPlaceStack {
	
	public String reverse(String s){
		
		String r="";
		Stack<Character> stack=new Stack<Character>();
		
		for(int i=0;i<=s.length();i++){
			
			if(i<s.length() && s.charAt(i)!=' '){
				stack.add(s.charAt(i));
				//System.out.print(s.charAt(i));
			}
			else{
				while(!stack.isEmpty()){
					
					//System.out.print(stack.peek());
					r=r+stack.peek();
					stack.pop();
				}
				r=r+" ";
			}
		}
		
		return r;
	}
	
	public static void main(String[] args)throws IOException{
		
		ReverseInPlaceStack re=new ReverseInPlaceStack();
		System.out.println(re.reverse("hello world"));
		
	}

}
