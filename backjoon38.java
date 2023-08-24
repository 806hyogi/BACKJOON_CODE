package backjoon;

import java.util.Scanner;

public class backjoon38 {

	public static void main(String[] args) {
		int arr[][] = new int[10][10];

		int max = arr[0][0];

		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= 9; i++) {

			for (int j = 1; j <= 9; j++) {

				arr[i][j] = sc.nextInt();
			}
		}

		for (int i = 1; i <= 9; i++) {

			for (int j = 1; j <= 9; j++) {

				if (arr[i][j] > max) {
					max = arr[i][j];
				}
			}
		}
		
		
		for (int i = 1; i <= 9; i++) {

			for (int j = 1; j <= 9; j++) {

				if(max == arr[i][j]) {
					System.out.println(max);
					System.out.println(i + " " + j);
					return;
				}
			}
		}
	}
}
