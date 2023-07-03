package test;

import java.util.Scanner;

public class backjoon05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.next();
		String str2 = sc.next();
		
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		
		double num3 = (double)num1 / num2;
		System.out.println(num3);
	}

}
