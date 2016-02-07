import java.io.*;
import java.util.*;

public class SubsetSum {
	
	public void findSubset(int[] arr, int sum){
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		for(int i=0;i<=arr.length-1;i++){
			
			if(!list.contains(arr[i])){
				list.add(sum-arr[i]);
			}
			else{
				System.out.println("Numbers with sum: "+sum+" are "+arr[i]+" and "+(sum-arr[i]));
			}
		}
	}
	
	public static void main(String[] arrgs) throws IOException{
		
		int[] arr={2,3,4,7,8,10};
		SubsetSum s=new SubsetSum();
		s.findSubset(arr, 10);
	}

}
