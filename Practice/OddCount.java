import java.io.*;
import java.util.*;

public class OddCount {
	
	HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
	
	public void count(int[]arr){
		
		for(int i=0;i<=arr.length-1;i++){
			
			if(map.get(arr[i])==null){
				map.put(arr[i], 1);
			}
			else{
				
				map.put(arr[i], map.get(arr[i])+1);
			}
		}
		
		for(Map.Entry<Integer, Integer> entry: map.entrySet()){
			
			if(entry.getValue()%2!=0){
				System.out.println(entry.getKey());
			}
			
		}
		
	}
	
	public static void main(String[] args) throws IOException
	{
		OddCount o=new OddCount();
		int[] a={1,1,1,4,2,3,2,2,4};
		o.count(a);
		
	}

}
