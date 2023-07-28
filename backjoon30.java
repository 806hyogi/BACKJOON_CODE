import java.util.Scanner;

public class backjoon26 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String num = sc.nextLine();
		String inputNum = sc.nextLine();

		int sum = 0;
		for (int j = 0; j < inputNum.length(); j++) {
			char charValue = inputNum.charAt(j);

			sum += Character.getNumericValue(charValue);

		}
		System.out.println(sum + "");
	}

}
