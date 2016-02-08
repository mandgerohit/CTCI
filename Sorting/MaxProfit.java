import java.io.*;

public class MaxProfit{

	public void calc(int[] price){
		
		int min=price[0];
		int maxProfit=0;
		int minIndex=0;
		int maxIndex=0;
		int profit=0;
		for(int i=1; i<=price.length-1;i++){
			
			if(price[i]<min){
				min=price[i];
				minIndex=i;	
			}
			else{
				profit=price[i]-min;
			}
			if(profit>maxProfit){
				maxProfit=profit;
				maxIndex=i;
			}
			
		}
		System.out.println("Max Profit is: "+maxProfit);
		System.out.println("Max Price Day is: "+maxIndex+" with the price value: "+price[maxIndex]);
		System.out.println("Min Price Day is: "+maxProfit+" with the price value: "+price[minIndex]);
	}
	
	public static void main(String[] args)throws IOException{
		
		int[] arr={5,3,7,6,10,9,8};
		
		MaxProfit m=new MaxProfit();
		m.calc(arr);
	}
	
}
