import java.io.IOException;

public class IntToNumOptimized {

	String[] small={"one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","Eighteen","ninerteen"};
	String[] large={"ten","twnety","thirty","forty","fifty","sixty","seventy","eighty","ninety","hundred","thousand"};
	
	public String func(int num){
		
		String s="";
		return returnString(s, num);
	}
	
	public String returnString(String s, int num){
		
		int length = String.valueOf(num).length();
		int den=(int) Math.pow(10, length-1);
		
		while(length>=3 && num>=100){
			int s1=num/den;
			int s2=0;
			if(den==1000){
			s2=large.length-1;
			}
			else{
				s2=large.length-2;
			}
			s=s+ small[s1-1]+" "+large[s2]+" ";
			//System.out.println(s);
			num= num%den;
			//System.out.println(num);
			length = String.valueOf(num).length();
			//System.out.println(length);
			den=(int) Math.pow(10, length-1);
		}
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
		
		IntToNumOptimized i=new IntToNumOptimized();
		System.out.println(i.func(5345));
	}
	
}
