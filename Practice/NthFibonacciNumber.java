import java.io.*;

public class NthFibonacciNumber {
	
	
	public int fibo(int n){
		
		int[] fibo=new int[n+1];
		fibo[0]=0;
		fibo[1]=1;

		for(int i=2;i<=n;i++){
			
			fibo[i]=fibo[i-1]+fibo[i-2];
			//System.out.println(fibo);
		}
		return fibo[n];
	}
	
	public static void main(String[] args)throws IOException{
		
		NthFibonacciNumber f= new NthFibonacciNumber();
		long startTime = System.nanoTime();
		System.out.println(f.fibo(6));
		long endTime = System.nanoTime();
		System.out.println((double)(endTime-startTime)/1000000);
		
	}
}
