
import java.util.Scanner;

public class backjoon27 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String inputStr = sc.nextLine();

		for (char i = 97; i <= 122; i++) {
			int index = inputStr.indexOf(i);
			System.out.print(index + " ");
		}
	}

}
