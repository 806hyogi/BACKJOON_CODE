package test;

import java.util.Scanner;

public class backjoon10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int strNum = Integer.parseInt(str);
		
		for(int i=1; i<=strNum; i++) {
			
			String num1 = sc.next();
			String num2 = sc.next();
			
			int number1 = Integer.parseInt(num1);
			int number2 = Integer.parseInt(num2);
			
			
			System.out.println("Case #" + i + ":" + " " + number1 + " + " + number2 + " = " + (number1+number2));
		}
	}

}
