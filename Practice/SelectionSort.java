import java.io.*;
import java.util.*;

public class SelectionSort {
	
	public int[] sort(int[] arr){
		
		for(int j=0;j<=arr.length-2;j++){
			
			int max=j;
			for(int i=j+1;i<=arr.length-1;i++){
				
				if(arr[i]>arr[j]){
					max=i;
				}
			}
			int temp=arr[j];
			arr[j]=arr[max];
			arr[max]=temp;
		}
		
		return arr;
		
	}

	public static void main(String args[]) throws IOException
	{
		
		SelectionSort s=new SelectionSort();
		int[] array={3,1,7,6,2,9,7,10};
		int[] arr=s.sort(array);
		
		for(int i=0;i<=arr.length-1;i++){
			System.out.println(arr[i]);
		}
		
	}
	
}