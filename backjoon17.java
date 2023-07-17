import java.util.Scanner;

public class backjoon17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int inputData = sc.nextInt();
		int a[] = new int[inputData]; // 5
		
		int max = a[0]; // 최댓값
		int min = a[0]; // 최솟값
		
		for (int i = 0; i < inputData; i++) { // 0 1 2 3 4
			
			a[i] = sc.nextInt(); // 20 10 35 30 7

			// 최댓값
			if(max < a[i]) {
				max = a[i];
			}
			
			// 최솟값
			if(min > a[i]) {
				min = a[i];
			}
		}
		
		System.out.println(min + " " + max);

	}

}
