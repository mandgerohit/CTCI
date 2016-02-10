import java.io.*;
import java.util.*;

public class FindAnagrams {
	
	private Map<String, ArrayList<Integer>> set=new HashMap<String,ArrayList<Integer>>();
	
	public void check(String[] arr){
		
		ArrayList<Integer> list;
		for(int i=0;i<=arr.length-1;i++){
			
			char[] temp=arr[i].toCharArray();
			Arrays.sort(temp);
			
			String s=String.valueOf(temp);
			if(!set.containsKey(s)){
				list=new ArrayList<Integer>();
				list.add(i);
				//System.out.println(s);
			}
			else{
				list=set.get(s);
				//System.out.println(i);
				list.add(i);
				//System.out.println("Anagrams are "+arr[set.get(s)]+" and "+arr[i]);			
			}	
			
			set.put(s, list);
		}
		
		for(Map.Entry<String, ArrayList<Integer>> e: set.entrySet()){
			System.out.println("\n");
			for(int i=0;i<=e.getValue().size()-1;i++){
				
				System.out.print(arr[e.getValue().get(i)]+" ");
			}
		}
	
	}
	
	public static void main(String[] args)throws IOException{
		
		String[] words={"cat","dog","man","nam","tac","act"};

		FindAnagrams f=new FindAnagrams();
		f.check(words);
	}

}
