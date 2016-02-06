import java.io.*;

public class ReverseString {

	public String reverse(String s){

		char[] arr=s.toCharArray();
		int len=s.length();
		int halflen=len/2;

		for(int i=0;i<=halflen-1;i++){

			char temp=arr[i];
			arr[i]=arr[len-1-i];
			arr[len-1-i]=temp;
		}
		
		return String.valueOf(arr);

	}
	
	public static void main(String[] args)throws IOException{
		
		String s1="rohitm";

		ReverseString a=new ReverseString();
		
			System.out.println(a.reverse(s1));
		
	}
	

}
