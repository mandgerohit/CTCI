import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RollingString {

	static String rollingString(String s,String[] operations) {
		return s;
		
	}
	
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		final String fileName= System.getenv("OUTPUT_PATH");
		BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
		String res;
		String _s;
		try{
			_s=in.nextLine();
			
		}
	catch(Exception e) {
		_s = null;
	}
			int _operations_size=0;
			_operations_size= Integer.parseInt(in.nextLine().trim());
			String[] _operations= new String[_operations_size];
			String _operations_item;
			for ( int _operations_i=0;_operations_i<_operations_size;_operations_i++)
			{
				try{
					_operations_item=in.nextLine();
					
				}
			catch(Exception e)
			{
				_operations_item = null;
			}
				_operations[_operations_i] = _operations_item;
			}
			
			res = rollingString(_s,_operations);
			bw.write(res);
			bw.newLine();
			bw.close();
			
			}

}
