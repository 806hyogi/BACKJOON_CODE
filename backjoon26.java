package backjoon;

import java.util.Scanner;
public class backjoon26 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		int inputNum = Integer.parseInt(sc.nextLine());
		char charValue = input.charAt(inputNum-1);
		
		System.out.println(charValue);
	}

}
