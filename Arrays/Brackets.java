import java.io.*;
import java.util.*;

public class Brackets {
	
	
	public ArrayList<String> returnBrackets(int n){
		
		ArrayList<String> list=new ArrayList<String>();
		
		if(n==1){
			list.add("()");
			return list;
		}
		
		ArrayList<String> list1= returnBrackets(n-1);
		
		for(String s: list1){
			
			String temp="("+s+")";
			if(!list.contains(temp)){			
				list.add(temp);
			}
			
			String temp2="()"+s;
			if(!list.contains(temp2)){			
				list.add(temp2);
			}
			
			String temp3=s+"()";
			if(!list.contains(temp3)){			
				list.add(temp3);
			}
		}
		
		return list;
		
	}
	
	public static void main(String[] args) throws IOException{
		
		Brackets b = new Brackets();
		ArrayList<String> l=b.returnBrackets(3);
		
		for(String s: l){
			System.out.println(s);
		}
	}

}
