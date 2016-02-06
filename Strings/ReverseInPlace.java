import java.util.Stack;
import java.io.*;

public class ReverseInPlace {
	
	public String reverse(String s){
			
			StringBuilder sb=new StringBuilder();
			
			String[] words=s.split(" ");
			
			for(String s1: words){
				
				for(int i=s1.length()-1;i>=0;i--){
					
					sb.append(s1.charAt(i));
					
				}
				sb.append(" ");
			}
			
			return sb.toString().trim();
	}
	
	public static void main(String[] args)throws IOException{
		
		ReverseInPlace re=new ReverseInPlace();
		System.out.println(re.reverse("hello world"));
		
	}
	
}
