import java.io.IOException;
import java.util.*;

public class Leader {

	public static void main(String[] args) throws IOException
	{
		Leader s=new Leader();
		int[] a={1,1,-2147483647,-2147483647,-2147483647};
		
		int p=s.leader(a);
		System.out.println(p);
	}
	
    public int leader(int[] A) {
        // write your code in Java SE 8

    	Map<Integer,Integer> map=new HashMap<Integer, Integer>();
        
    	for(int i=0;i<=A.length-1;i++){
    		
    		if(map.get(A[i])==null) map.put(A[i], 1);
    		else map.put(A[i], map.get(A[i])+1);
    		//System.out.println(A[i]+" "+map.get(A[i]));
    		
    		if(map.get(A[i])!=null && map.get(A[i])>A.length/2) return A[i];
        }
    	
    	return -1;
    }
	
}
