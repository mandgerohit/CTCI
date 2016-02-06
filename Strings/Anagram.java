import java.io.*;

public class Anagram{
	
	public boolean isAnagram(String word, String anagram){
		
		if(word.length()!=anagram.length()){
			
			return false;
		}
		char[] words=word.toCharArray();

		for(char c: words){
		
			int i=anagram.indexOf(c);

			if(i!=-1){
				
				anagram=anagram.substring(0, i)+anagram.substring(i+1, anagram.length());
							
			}
			else{
				return false;
			}
		}
		return true;	

	}
	
	public static void main(String[] args)throws IOException{
		
		String s1="car";
		String s2="arc";
		
		Anagram a=new Anagram();
		
		if(a.isAnagram(s1, s2)){
			System.out.println("Words are anagram");
		}
		else{
			System.out.println("Words are Not anagram");
		}
		
	}

}