package backjoon;

import java.util.Scanner;

public class backjoon20 {

	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		
		String Array = sc.next(); // 5
		String input = sc.next(); // 4
		
		int Arr = Integer.parseInt(Array);
		int inp = Integer.parseInt(input);
		
		int []ArrayNum = new int[Arr+1]; // 5
		
		for(int i = 0; i < inp; i++) { // 4
			
			String inputData = sc.next();
			String inputData2 = sc.next();
			String inputData3 = sc.next();
			
			int input1 = Integer.parseInt(inputData);
			int input2 = Integer.parseInt(inputData2);
			int input3 = Integer.parseInt(inputData3);
			
			
			for (int j = input1; j <= input2; j++) { // 1 ~ 2
				ArrayNum[j] = input3; // 3
			}
		}
		for(int a = 1; a < Arr + 1; a++) {
			System.out.print(ArrayNum[a] + " ");
		}
	}

}
