import java.io.*;
import java.util.*;

public class Grid {
	
	int[][] n=new int[1][1];
	int minDiff;
	
	public int[][] grid(int p){
		
		HashMap<Integer, HashMap<Integer, Integer>> map=new HashMap<Integer, HashMap<Integer, Integer>>();
		HashMap<Integer, Integer> temp;
		minDiff=p+1;
		for(int x=p;x<=p+2;x++){
			if(isSqaure(x)) {
				int x1=(int)Math.sqrt(x);
				return new int[x1][x1];
			}
			else{
				temp=new HashMap<Integer, Integer>();
				map.put(x, temp);
				temp.put(1, x);
				//System.out.println(temp.get(1));
				for(int i=2;i<=x/2-1;i++){
						
					if(x%i==0){
						//temp=map.get(x);
						//System.out.println(minDiff);
						int diff=Math.abs((x/i)-i);
						if(diff<minDiff){
							minDiff=diff;
							temp.clear();
							temp.put(i, x/i);
							map.put(x,temp);
						}
					}
				}
			}
		}
		
		for(Map.Entry<Integer,HashMap<Integer, Integer>> e: map.entrySet()){
			for(Map.Entry<Integer, Integer> e1: e.getValue().entrySet()){
				if(Math.abs(e1.getKey()-e1.getValue())==minDiff){
					n=new int[e1.getKey()][e1.getValue()];
					System.out.println(e.getKey()+" "+e1.getKey()+" "+e1.getValue());
				}
			}
		}
		
		return n; 
	}
	
	public boolean isSqaure(int n){
		
		int n1=(int)Math.sqrt(n);
		return n1*n1==n;
	}
	
	public static void main(String[] args)throws IOException{
		
		Grid g=new Grid();
		int[][] matrix=g.grid(21);
		int k=1;
		for(int i=0;i<=matrix.length-1;i++){
			System.out.println("\n");
			for(int j=0;j<=matrix[i].length-1;j++){
				System.out.print(k+" ");
				k++;
			}
		}
	}
}
