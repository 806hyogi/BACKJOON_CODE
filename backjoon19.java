
import java.util.Scanner;
import java.util.Arrays;

public class backjoon19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] num = new int[10];

		for (int i = 1; i <= 9; i++) {

			num[i] = sc.nextInt();

		}

		int maxValue = Arrays.stream(num).max().getAsInt();

		int count = 1;

		boolean abc = true;
		while (abc) {
			for (int j = 1; j <= 9; j++) {
				if (maxValue == num[j]) {
					count = j;
					abc = false;

				}

			}
		}

		System.out.println(maxValue);
		System.out.println(count);

	}

}
