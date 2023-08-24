package backjoon;

import java.util.Scanner;

public class backjoon37 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int input = Integer.parseInt(sc.next());
		int input2 = Integer.parseInt(sc.next());

		int arr1[][] = new int[input][input2];

		int arr2[][] = new int[input][input2];
		
		
		for (int i = 0; i < input; i++) {
			for (int j = 0; j < input2; j++) {
				arr1[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < input; i++) {
			for (int j = 0; j < input2; j++) {
				arr2[i][j] = sc.nextInt();
			}
		}

		int arr3[][] = new int[input][input2];

		for (int i = 0; i < input; i++) {
			for (int j = 0; j < input2; j++) {
				arr3[i][j] = arr1[i][j] + arr2[i][j];
			}
		}

		for (int i = 0; i < input; i++) {
			for (int j = 0; j < input2; j++) {
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}

	}
}
