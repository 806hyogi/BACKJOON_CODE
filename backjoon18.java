import java.util.Scanner;
import java.util.Arrays;

public class backjoon18 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int inputData = sc.nextInt();
		int [] num = new int [inputData];
		
		for(int i = 0; i < inputData; i++) {
			
			num[i] = sc.nextInt();
		}
		int maxValue = Arrays.stream(num).max().getAsInt();
		int minValue = Arrays.stream(num).min().getAsInt();
		
		System.out.println(minValue + " " + maxValue);
	}

}
