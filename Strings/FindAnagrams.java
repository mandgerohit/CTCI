import java.io.*;
import java.util.*;

public class FindAnagrams {
	
	private Map<String, Integer> set=new HashMap<String,Integer>();
	
	public void check(String[] arr){

		for(int i=0;i<=arr.length-1;i++){
			
			char[] temp=arr[i].toCharArray();
			Arrays.sort(temp);
			
			String s=String.valueOf(temp);
			if(!set.containsKey(s)){
				set.put(s, i);
				//System.out.println(s);
			}
			else{
				System.out.println("Anagrams are "+arr[set.get(s)]+" and "+arr[i]);			
			}	
		}
	
	}
	
	public static void main(String[] args)throws IOException{
		
		String[] words={"cat","dog","man","nam","tac"};

		FindAnagrams f=new FindAnagrams();
		f.check(words);
	}

}
