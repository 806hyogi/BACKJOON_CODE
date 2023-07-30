package backjoon;

import java.util.Scanner;

public class backjoon34 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String num1 = sc.nextLine();

		String index = num1.substring(0, 3);
		String index2 = num1.substring(4);

		StringBuffer sb = new StringBuffer(index);
		String reverse1 = sb.reverse().toString();

		StringBuffer sb2 = new StringBuffer(index2);
		String reverse2 = sb2.reverse().toString();

		if (Integer.parseInt(reverse1) > Integer.parseInt(reverse2)) {
			System.out.println(reverse1);
		} else {
			System.out.println(reverse2);
		}

	}

}
