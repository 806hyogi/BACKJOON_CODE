package backjoon;

import java.util.Scanner;


public class backjoon40 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String arr = sc.next();
		int num = sc.nextInt();
		int result = 0;

		for(int i = 0; i < arr.length(); i++) {
			
			String arr2 = arr.toLowerCase();

			System.out.println((int)arr2.charAt(i));
			
			
			result += arr.charAt(i) * Math.pow(num, i);
			
			
			System.out.println(result);
		}
		
		System.out.println(result);
	}

}
