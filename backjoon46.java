import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next()); // 6
		int k = Integer.parseInt(sc.next()); // 3

		// ����� ����
		int cnt = 0;
		
		// k��° ���
		int result = 0;
		
		for(int i = 1; i <= n; i++) {  // 1 2 3 4 5 6
			
			if(n % i == 0) { // 6�� i�� �������� �������� 0�̸�
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