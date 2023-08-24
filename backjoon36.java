package backjoon;

import java.util.Scanner;

public class backjoon36 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();
		StringBuffer sb = new StringBuffer(input);
		String reversel = sb.reverse().toString();
		if (input.equals(reversel)) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}

	}

}
