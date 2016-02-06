import java.io.IOException;

public class BinaryGap {

	public static void main(String[] args) throws IOException
	{
		BinaryGap s=new BinaryGap();
		
		int p=s.solution(33);
		System.out.println(p);
	}
	
	
	public String toBinary(int n){
		
		String num="";
		
		if(n==0){
			return num="0";
		}
		
		while(n>0){
			int rem=n%2;
			num= rem + num;
			n=n/2;
		}
		
		System.out.println(num);
		return num;
	}
	
	public int solution(int a) {
		
		int max_count=0;
		
		String bin=toBinary(a);
		
		int count=0;
		
		for(int i=0;i<=bin.length()-1;i++){
			
			if(bin.charAt(i)=='1'){
				if(count>max_count){
					max_count=count;
					count=0;
				}
			}
			else{
				count++;
			}
		}
		
		return max_count;
	}
	
}
