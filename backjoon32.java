package backjoon;

import java.util.Scanner;

public class backjoon32 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int input = Integer.parseInt(sc.nextLine()); // R¹ø ¹Ýº¹

		for (int i = 0; i < input; i++) {
			int a = Integer.parseInt(sc.next());
			String strN = sc.next();

			for (int k = 0; k < strN.length(); k++) {
				for (int j = 0; j < a; j++) {
					System.out.print(strN.charAt(k));
				}

			}
			System.out.println("");
		}

	}

}
