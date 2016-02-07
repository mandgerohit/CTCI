import java.io.*;
import java.util.*;

public class RemoveDuplicatesString{
	
	public String remove(String s){
		
		ArrayList<Character> list=new ArrayList<Character>();

		char[] sarr=s.toCharArray();
		StringBuilder str=new StringBuilder();
		
		for(int i=0;i<=s.length()-1;i++){
			
			if(!list.contains(sarr[i])){
				list.add(sarr[i]);
				str.append(sarr[i]);
			}
		}
		
		return str.toString();
	}

	public static void main(String[] args) throws IOException{

		RemoveDuplicatesString rem=new RemoveDuplicatesString();
		
		System.out.println(rem.remove("aaabccbbbdgh"));	
		
	}

}
