import java.io.*;

public class LongestCommonSubsequence {
	
	String seq="";
	
	public String find(String s1, String s2){
		

		int[][] longseq=new int[s1.length()+1][s2.length()+1];
		
		for(int i=s1.length()-1;i>=0;i--){
			
			for(int j=s2.length()-1;j>=0;j--){
				
				if(s1.charAt(i)==s2.charAt(j)){
					longseq[i][j]=longseq[i+1][j+1]+1;
				}
				else{
					longseq[i][j]=Math.max(longseq[i+1][j], longseq[i][j+1]);
				}
			}
			
		}
		
		int i=0;
		int j=0;
		
		while(i<=s1.length()-1 && j<=s2.length()-1)
		{
			if(s1.charAt(i)==s2.charAt(j)){
				seq=seq+s1.charAt(i);
				i++;
				j++;
			}
			
			else{
				
				if(longseq[i+1][j]>=longseq[i][j+1]){
					i++;
				}
				else{
					j++;
				}
			}
		}
		
		return seq;
	}
	
	public static void main(String[] args)throws IOException{
		
		LongestCommonSubsequence re=new LongestCommonSubsequence();
		System.out.println(re.find("helloworld", "helbbor"));
		
	}

}
