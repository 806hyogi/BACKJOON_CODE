package test;

import java.util.Scanner;

public class backjoon11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String inputData = sc.nextLine();
		int Data = Integer.parseInt(inputData);
		
		for(int i = 0; i < Data; i++) {

			for(int j = 0; j <= i*1; j++) {
				
				System.out.print("*");
				
			}
			System.out.println("");
		}

	}

}
