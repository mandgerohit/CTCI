import java.io.*;
public class Equilibrium {

	public static void main(String[] args) throws IOException
	{
		Equilibrium s=new Equilibrium();
		int[] a={};
		
		int p=s.solution(a);
		System.out.println(p);
	}
	
    public int solution(int[] A) {
        // write your code in Java SE 8

        long sum=0;
        
        if(A.length==0) return -1;
        
        for(int i=0;i<=A.length-1;i++){
        	sum=sum+A[i];
        }
        
        long sum_before=0;
        long sum_after=sum-A[0];
        
        if(sum_before==sum_after) return 0;
        
        int eq=1;
        
        while(eq<=A.length-1){
        	
        	sum_before=sum_before+A[eq-1];
        	sum_after=sum_after-A[eq];
        	
        	if(sum_before==sum_after) return eq;
        	else eq++; 	
        }
        return -1;
        
    }
}
