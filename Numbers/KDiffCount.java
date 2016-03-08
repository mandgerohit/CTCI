import java.io.*;
import java.util.*;

public class KDiffCount{
	
	public static void main(String[] args){
		
		int[] arr={3,4,1,7,2,8,9,10};
		System.out.println(kDiff(arr, 2));
	}
	
	public static int kDiff(int[] arr, int k){
		
		Arrays.sort(arr);
		
		int i=0;
		int j=1;
		int count=0;
		while(j<=arr.length-1){
			
			if(arr[j]-arr[i]==k){
				count++;
				i++;
				j++;
			}
			else{
				if(arr[j]-arr[i]<k){
					j++;
				}
				else{
					i++;
				}
			}
		}
		return count;
	}
}