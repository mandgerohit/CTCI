import java.io.*;
import java.util.*;

public class KthHighestRepeatedNumber {

	public int find(int[] arr, int k){
		
		Integer max=0;
		Integer maxKey=0;
		
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		
		for(int i=0;i<=arr.length-1;i++){
			
			if(map.containsKey(arr[i])){
				
				map.put(arr[i], map.get(arr[i])+1);
			}
			else{
				map.put(arr[i], 1);
			}
		}
		
		Integer ans=0;
	
		for(int j=0;j<=k-1;j++){
			max=0;
			for(Map.Entry<Integer, Integer> e: map.entrySet()){
				
				if(e.getValue()>max){
					
					max=e.getValue();
					maxKey=e.getKey();
				}
			}
			ans=maxKey;
			//System.out.println((int)ans);
			map.remove(maxKey);
			
		}
		return (int)ans;
	}
	
	public static void main(String[] args) throws IOException{
		
		int[] a={1,1,1,2,2,3,3,3,3,3,2,2};
		
		KthHighestRepeatedNumber kth=new KthHighestRepeatedNumber();
		System.out.println(kth.find(a, 3));
	}
	
}
