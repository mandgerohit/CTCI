import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Jumps {
	
	static int jumps(int k,int j) {
		return j;
	}

	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(System.in);
		final String fileName= System.getenv("OUTPUT_PATH");
		BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
		int res;
		int _k;
		_k= Integer.parseInt(in.nextLine().trim());
		int _j;
		_j= Integer.parseInt(in.nextLine().trim());
		
		res = jumps(_k,_j);
		bw.write(String.valueOf(res));
		bw.newLine();
		bw.close();

	}
}
