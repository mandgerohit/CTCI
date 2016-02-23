import java.io.*;
import java.util.*;

public class HighestRepeatedElementMult {
	
	Map<Integer, Integer> set=new HashMap<Integer, Integer>();
	
	public void mult(int[] arr){ 
			
		int sum=0;
		int maxCount=0;
		int max=arr[0];
			
		for(int i=0;i<=arr.length-1;i++){
			
			if(!set.containsKey(arr[i])){
				set.put(arr[i], 1);
			}
			
			else{
				set.put(arr[i], set.get(arr[i])+1);
				if(set.get(arr[i])>maxCount){
					maxCount=set.get(arr[i]);
					max=arr[i];
				}
				if(set.get(arr[i])==maxCount){
					max= max<=arr[i]? arr[i]: max;
				}						
			}
		}				
		
		System.out.println("The multiplication of maximum occurring number is "+max*maxCount);	
	}


	public static void main(String[] args) throws IOException{
		
		HighestRepeatedElementMult h=new HighestRepeatedElementMult();
		int[] arr={1,1,2,1,3,3,3,4,4,4,1};
		h.mult(arr);
	}
}
