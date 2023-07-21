import java.util.Scanner;

public class backjoon21 {
	public static void main(String arg[]) {

		Scanner sc = new Scanner(System.in);
		String inputdata = sc.next();
		String inputdata2 = sc.next();

		int input = Integer.parseInt(inputdata);
		int input2 = Integer.parseInt(inputdata2);

		int data[] = new int[input + 1];

		for (int j = 1; j <= input; j++) {
			data[j] = j;
		}

		for (int i = 1; i <= input2; i++) {

			String inputdata3 = sc.next();
			String inputdata4 = sc.next();

			int input3 = Integer.parseInt(inputdata3);
			int input4 = Integer.parseInt(inputdata4);

			int temp = data[input4];
			data[input4] = data[input3];
			data[input3] = temp;

		}
		// 결과
		for (int a = 1; a <= input; a++) {
			System.out.print(data[a] + " ");
		}
	}
}
