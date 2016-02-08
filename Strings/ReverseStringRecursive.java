import java.io.*;

public class ReverseStringRecursive {
	
	public String reverse(String s){
		
		if(s.length()==0) 
			return s;
		
		return reverse(s.substring(1))+s.charAt(0);
	}
	
	public static void main(String[] args)throws IOException{
		
		ReverseStringRecursive re=new ReverseStringRecursive();
		System.out.println(re.reverse("helloworld"));
		
	}

}
