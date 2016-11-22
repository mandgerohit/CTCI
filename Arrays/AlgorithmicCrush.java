import java.util.Scanner;

public class AlgorithmicCrush {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();
		String[] inputs = input.split(" ");
		int n = Integer.parseInt(inputs[0]);
		int m = Integer.parseInt(inputs[1]);

		long[] list = new long[n+1];

		for (long i = 0; i < m; i++) {
			String operation = sc.nextLine();

			String[] operands = operation.split(" ");
			int from = Integer.parseInt(operands[0]);
			int to = Integer.parseInt(operands[1]);
			long number = Integer.parseInt(operands[2]);

			list[from - 1] = list[from - 1] + number;
			list[to] = list[to] - number;
		}
		System.out.println(getMax(list));
	}

	public static long getMax(long[] list) {
		long max = list[0];
		long sum = max;
		for (int i = 1; i < list.length; i++) {
			sum = sum + list[i];
			if (sum > max)
				max = sum;
		}
		return max;
	}
}
