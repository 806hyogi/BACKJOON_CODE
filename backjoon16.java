// 20230714
import java.util.Scanner;

public class backjoon16 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int inputData = sc.nextInt();
		int inputData2 = sc.nextInt();
		
		int a [] = new int[inputData];
		
		for(int i = 0; i < inputData; i++) {
			
			a [i] = sc.nextInt();
			
			if(inputData2 > a[i]) {
				System.out.print(a[i] + " ");
			}
			
		}
		
	}
}
