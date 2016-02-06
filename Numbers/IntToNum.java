import java.io.*;

public class IntToNum {

	String[] small={"one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","Eighteen","ninerteen"};
	String[] large={"ten","twnety","thirty","forty","fifty","sixty","seventy","eighty","ninety","hundred","thousand"};
	
	public String func(int num){
		
		String s="";
		return returnThousand(s, num);
	}
	
	public String returnThousand(String s, int num){
		
		if(num>=1000){
			int s1=num/1000;
			int s2=large.length-1;
			s=s+ small[s1-1]+" "+large[s2]+" ";
			return returnHundred(s, num%1000);
		}
		else{
			return returnHundred(s, num);
		}
	}
	
	public String returnHundred(String s, int num){
		
		if(num>=100){
			int s1=num/100;
			int s2=large.length-2;
			s= s+ (small[s1-1]+" "+large[s2]+" ");
			return returnTens(s, num%100);
		}
		else{
			return returnTens(s, num);
		}
	}

	public String returnTens(String s,int num){
		
		if(num>=20){
			int s1=num/10;
			int s2=num%10;
			s= s+(large[s1-1]+" "+small[s2-1]+" ");
			return s;
		}
		else{
			return s+ small[num-1]+" ";
		}
		
	}
	
	public static void main(String[] args) throws IOException{
		
		IntToNum i=new IntToNum();
		System.out.println(i.func(5401));
	}
	
}
