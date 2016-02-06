import java.io.*;
import java.util.*;

public class PermutationPalindrome {
	
	public boolean isPermutation(String s){
		
		char[] arr=s.toCharArray();
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		
		int countOdd=0;
		
		for(char c: arr){
			
			if(map.get(c)==null){
				map.put(c,1);
				countOdd++;
			}
			else{
				map.put(c,map.get(c)+1);
				
				if(map.get(c)%2==0){
					countOdd--;
				}
				else{
					countOdd++;
				}
			}
		}
		
		return countOdd<=1;
	}
	
	
	public static void main(String[] args)throws IOException{
		
		PermutationPalindrome p=new PermutationPalindrome();
		
		String s1="abbac";
		if(p.isPermutation(s1)){
			System.out.println("It is a Permutation of a Palindrome");
		}
		else{
			System.out.println("It is NOT a Permutation of a Palindrome");
		}
		
	}
}
