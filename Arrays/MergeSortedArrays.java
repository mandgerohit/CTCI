import java.io.*;
import java.util.*;

public class MergeSortedArrays {

	public void merge(int[] a, int[] b){
		
		int maxLen=a.length+b.length;
		a=Arrays.copyOf(a, a.length+1);
		b=Arrays.copyOf(b, b.length+1);
		a[a.length-1]=Integer.MAX_VALUE;
		b[b.length-1]=Integer.MAX_VALUE;
		//System.out.print(a[a.length-1]);
		int i=0;
		int j=0;
		int k=0;
		int[] c=new int[maxLen];
		while(k<=maxLen-1){
			
			if(a[i]<=b[j]){
				c[k]=a[i];
				//System.out.print(c[k]+" ");
				i++;
			}
			else{
				c[k]=b[j];
				//System.out.print(c[k]+" ");
				j++;
			}

			k++;	
		}
		print(c);
			
	}
	
	public void print(int[] arr){
		
		for(int i=0;i<=arr.length-1;i++){
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) throws IOException{
		
		int[] a={1,3,4,5,6,7,8};
		int[] b={1,2,3,4,6,8,9};

		MergeSortedArrays m=new MergeSortedArrays();
		m.merge(a, b);
		
	}
	
}
