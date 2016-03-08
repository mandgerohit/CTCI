import java.io.*;
import java.util.*;

public class KDiffUsingHash{
	
	public static void main(String[] args){
		
		int[] arr={3,4,1,7,2,8,9,10};
		System.out.println(kDiff(arr, 2));
	}
	
	public static int kDiff(int[] arr, int k){
		
		ArrayList<Integer> set=new ArrayList<Integer>();
		int count=0;
		for(int i=0;i<=arr.length-1;i++){
			
			if(set.contains(arr[i])){
				count++;
				//System.out.println("Current Count is "+count+"\n");
			}
			else{
				if(!set.contains(arr[i]-k) && !set.contains(arr[i]+k)){
					//System.out.println(arr[i]-k+" "+(arr[i]+k)+"\n");
					set.add(arr[i]-k);
					set.add(arr[i]+k);
				}
				else{
					count++;
				}
			}
		}
		return count;
	}
}