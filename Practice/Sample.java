import java.io.*;
import java.util.*;

public class Sample{

	public static String reverse(String s){
		
		if(s.length()==0){
			return s;
		}
		
		
		return reverse(s.substring(1))+s.charAt(0);
	}
	
	public static void main(String[] args)throws IOException{

		System.out.println(reverse("hello"));
		
	}

}