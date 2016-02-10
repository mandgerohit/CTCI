import java.io.*;
import java.util.*;

public class GridVariable {
	
	int[][] n=new int[1][1];
	int minDiff;
	int num;
	int row;
	int col;
	
	public void grid(int p){
		
		minDiff=p+1;

		for(int x=p;x<=p+2;x++){

			if(isSqaure(x)) {
				int x1=(int)Math.sqrt(x);
				num=x;
				row=x1;
				col=x1;
				System.out.print(num+" "+row+" "+col);
				return;
			}
			else{
				
				for(int i=2;i<=x/2-1;i++){
						
					if(x%i==0){
						
						int diff=Math.abs((x/i)-i);
						if(diff<minDiff){
							num=x;
							row=i;
							col=x/i;
						}
					}
				}
			}
		}
		
		System.out.print(num+" "+row+" "+col);
		return; 
	}
	
	public boolean isSqaure(int n){
		
		int n1=(int)Math.sqrt(n);
		return n1*n1==n;
	}
	
	public static void main(String[] args)throws IOException{
		
		GridVariable g=new GridVariable();
		g.grid(24);
	}
}
