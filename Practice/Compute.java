import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class Compute {

	static String compute(String s) {
		ArrayList<String> list = new ArrayList<String>();
		for (int i=0; i <= s.length() - 1; i++) {
			for (int j = i; j <= s.length() - 1; j++) {
				String sub = s.substring(i, j+1);
				
				if (!list.contains(sub)) {
					list.add(sub);
				}
			}
		}
		
		Collections.sort(list, Collections.reverseOrder());
		return list.get(0);
	}
	
	
	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(System.in);
		
		String res;
		String _s;
		try{
			_s=in.nextLine();
			
		}
	catch(Exception e)
	{
		_s = null;
	}
		res = compute(_s);
		System.out.println(res);	
	}
}
