import java.io.*;

public class NthFibonacciOptimized {
	
	public int fibo(int n){
		
		if(n==0){
			return 0;
		}
		int[][] F={{1,1},{1,0}};
		power(F, n-1);
		return F[0][0];
	}
	
	public void power(int[][] F, int n){
		
		if(n==0 || n==1){
			return;
		}
		
		power(F, n/2);
		int[][] M={{1,1},{1,0}};
		multiply(F, F);
		
		if(n%2!=0){
			multiply(F, M);
		}
	}
	
	public void multiply(int[][] F, int[][] M){
		
		int w=F[0][0]*M[0][0]+F[0][1]*M[1][0];
		int x=F[0][0]*M[0][1]+F[0][1]*M[1][1];
		int y=F[1][0]*M[0][0]+F[1][1]*M[1][0];
		int z=F[1][0]*M[0][1]+F[1][1]*M[1][1];
		
		F[0][0]=w;
		F[0][1]=x;
		F[1][0]=y;
		F[1][1]=z;
	}
	
	public static void main(String[] args) throws IOException{
		
		NthFibonacciOptimized fibo=new NthFibonacciOptimized();
		long startTime = System.nanoTime();
		System.out.println(fibo.fibo(6));
		long endTime = System.nanoTime();
		System.out.println((double)(endTime-startTime)/1000000);
		
	}

}
