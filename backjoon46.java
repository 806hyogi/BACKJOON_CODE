import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next()); // 6
		int k = Integer.parseInt(sc.next()); // 3

		// 약수의 순서
		int cnt = 0;
		
		// k번째 약수
		int result = 0;
		
		for(int i = 1; i <= n; i++) {  // 1 2 3 4 5 6
			
			if(n % i == 0) { // 6을 i와 나눴을때 나머지가 0이면
				cnt++; // 1 2 3
			}
			
			if(cnt == k) {
				result = i;
				break;
			}
			
		}
		System.out.println(result);


		
	}
}