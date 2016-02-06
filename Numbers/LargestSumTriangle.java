import java.io.*;
import java.util.*;

public class LargestSumTriangle {
	
	List<List<Integer>> triangle=new ArrayList<List<Integer>>();
	
	public static void main(String[] args)throws IOException{
		
		LargestSumTriangle largest=new LargestSumTriangle();
		System.out.println(largest.sum(largest.init()));
		
	}
	
	public List<List<Integer>> init(){
		
		triangle.add(Arrays.asList(5));
		triangle.add(Arrays.asList(4,6));
		triangle.add(Arrays.asList(3,7,8));
		triangle.add(Arrays.asList(2,9,10,9));
		
		return triangle;
	}
	
	public int sum(List<List<Integer>> tuples){
		
		int sum=0;
		
		for(int i=0;i<=tuples.size()-1;i++){
		
			sum=sum+findLargest(tuples.get(i));
		}
		return sum;
	}
	
	public int findLargest(List<Integer> list){
		
		Collections.sort(list);
		return list.get(list.size()-1);

	}

}
