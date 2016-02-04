import java.io.*;
import java.util.*;

public class ThirdLargestElement {
	
	public static void main(String[] args)throws IOException{
		
		ThirdLargestElement t=new ThirdLargestElement();
		int[] a={3,2,5,1,7,8,9};
		System.out.println(t.findThirdLargest(a));
		
	}
	
	public int findThirdLargest(int[] arr){
		
		//build a min heap of 3 elements
		int[] heap={arr[0],arr[1],arr[2]};
		
		int min=findMin(heap);
		
		for(int i=3;i<=arr.length-1;i++){
			
			if(arr[i]>heap[min]){
				
				heap[min]=arr[i];
				min=findMin(heap);
			}
		}
		return heap[min];
		
		
	}
	
	public int findMin(int[] heap){
		
		int temp;
		if(heap[0]<heap[1]){
			temp=0;
		}
		else{
			temp=1;
		}
		if(heap[temp]<heap[2]){
			return temp;
		}
		else{
			return 2;
		}
	}

}
