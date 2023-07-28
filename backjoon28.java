
import java.util.Scanner;

public class backjoon24 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int input = Integer.parseInt(sc.nextLine());

		String arr[] = new String[input + 1];

		char charValue = 0;
		char charValue2 = 0;

		for (int i = 0; i < input; i++) {

			String str = sc.nextLine();
			arr[i] = str;
			charValue = arr[i].charAt(0);
			charValue2 = arr[i].charAt(arr[i].length() - 1);
			arr[i] = charValue + "" + charValue2;
		}
		for (int i = 0; i < input; i++) {
			System.out.println(arr[i]);
		}
	}

}
