import java.io.*;

public class DecimalZip {
	
	public static void main(String[] args) throws IOException{
		
		DecimalZip s=new DecimalZip();
		System.out.println(s.solution(0,0));
		
	}
	
	public int solution(int A,int B){
		
		String s1=new Integer(A).toString();
		String s2=new Integer(B).toString();
		
		String ans="";
		int len=0;
		int j=0;
		int k=0;
		String max="";
		
		if(s1.length()<s2.length()){
			len=s1.length();
			max=s2;
		}
		else{
			if(s1.length()>s2.length()){
				len=s2.length();
				max=s1;
			}
			else{
				len=s1.length();
				max=s1;
			}
		}

		for(int i=0;i<=2*len-1;i++){
			
			if(i%2==0)
			{
			if(j<=len-1)
			{
				ans=ans+s1.charAt(j); 
				j++;
			}
			}
			
			else{
			if(k<=len-1)
			{
				ans=ans+s2.charAt(k); 
				k++;
			}
			}
		}
		
		for(int i=len;i<=max.length()-1;i++){
			ans=ans+max.charAt(i);
		}
		
		Long l=Long.parseLong(ans);
		if(l>100000000) return -1;
		else return (int)(l.longValue());
		
	}

}
