package backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class backjoon23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[11];

		int count = 0;

		for (int i = 0; i < 10; i++) {

			String inputData = sc.nextLine();
			int num = Integer.parseInt(inputData);

			arr[i] = num % 42;

		}

		for (int i = 0; i < 10; i++) {

			for (int j = i + 1; j < 10; j++) {

				if (arr[i] == arr[j]) {
					count++;
					break;
				}

			}

		}

		System.out.println(10 - count);

	}

}
