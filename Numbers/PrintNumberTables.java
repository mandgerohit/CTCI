import java.io.*;
import java.util.*;

public class PrintNumberTables {
	
	public void print(int n){
		
		for(int i=1;i<=n;i++){
			
			System.out.print("\n");
			for(int j=i;j<=i*n;j=j+i){
			
				System.out.print(j+" ");			
			}
		}
	}

	public static void main(String[] args) throws IOException{

		PrintNumberTables p =new PrintNumberTables();
		
		p.print(12);
	}
}
