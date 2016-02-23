import java.io.*;
import java.util.*;

public class SquareRoot{
	
	public static void main(String[] args){
		
		sqRoot(17);
	}
	
	public static void sqRoot(int n){
		
		if(n<0){
			System.out.println("Sqaure root not possible");
		}
		float g1;
		float sqrt=n/2;	
		do		
		{
			g1=sqrt;
			sqrt=(g1+n/g1)/2;
		}
		while((g1-sqrt)!=0);
		
		System.out.println("Sqaure root of a number is: "+sqrt);
		
	}
}