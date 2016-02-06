import java.io.*;

public class OneAway {

	public boolean checkAway(String s1, String s2){
		
		if(Math.abs(s1.length()-s2.length())>1){
			return false;
		}
		
		String small= s1.length()<s2.length()? s1: s2;
		String large= s1.length()<s2.length()? s2: s1;
		
		char[] arrSmall=small.toCharArray();
		char[] arrLarge=large.toCharArray();
		
		boolean change=false;
		int j=0;
		for(int i=0;i<=large.length()-1 && j<=small.length()-1;i++){
			
			if(arrSmall[j]!=arrLarge[i]){
				
				if(change){
					return false;
				}
				else{
					change=true;
					if(large.length()==small.length()) j++;
				}	
			}
			
			else{
				j++;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args)throws IOException{
		
		OneAway re=new OneAway();
		String s1="pale";
		String s2="bae";
		
		if(re.checkAway(s1, s2)){
			System.out.println("They are one operation away");
		}
		else{
			System.out.println("They are NOT one operation away");
		}
		
	}
	
}
