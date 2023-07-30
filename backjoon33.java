package backjoon;

import java.util.*;

public class backjoon33 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		str = str.trim();
		if (str.isEmpty()) {
			System.out.println(0);
		} else {
			String[] arr = str.split(" ");
			System.out.println(arr.length);
		}

	}

}
