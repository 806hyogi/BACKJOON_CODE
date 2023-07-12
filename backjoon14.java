package test;

import java.util.Scanner;

public class backjoon14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		

		// 입력값이 들어올 때까지 while문이 실행되지 않다가 입력값이 들어올때 내부가 실행됨
		while(sc.hasNextInt()) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();			
			
			int sum = a + b;
				
			System.out.println(sum);
			
		}
		
		
		
		
	}

}
