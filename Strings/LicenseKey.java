import java.io.*;

public class LicenseKey {
	
	public static String solution(String S, int k) {
		
		S = S.replace("-","").toUpperCase();

		StringBuilder S2 = new StringBuilder("");
		int totalLength = S.length()-1;
		for (int i = S.length()-1; i >= 0 ; i--) {
			if (i == totalLength - k) {
				S2.append("-");
				totalLength = totalLength - k;
			}
			S2.append(S.charAt(i));
		}	
		return S2.reverse().toString();
	}
	
	public static void main(String[] args) {
		
		System.out.println(solution("we-are--------", 1));
		//2-4ar7-4k-hgfd
	}
}
