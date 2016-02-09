import java.io.*;
import java.util.*;

public class TopKElements {
	
	public int[] getTopK(int[] a, int k){
		
		int[] top=new int[k];
		
		PriorityQueue<Integer> heap = new PriorityQueue<Integer>(a.length, Collections.reverseOrder());
		
		for(int i=0;i<=a.length-1;i++){
			
			heap.add(a[i]);
		}
		
		for(int i=0;i<=k-1;i++){
			
			top[i]=(int) heap.poll();
		}
		
		return top;
	}
	
	public static void main(String args[]) throws IOException
	{
		
		TopKElements s=new TopKElements();
		int[] array={3,1,7,6,2,9,7,10};
		int[] arr=s.getTopK(array, 3);
		
		for(int i=0;i<=arr.length-1;i++){
			System.out.println(arr[i]);
		}
		
	}

}
