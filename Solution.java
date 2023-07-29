package Samsung;

import java.util.Scanner;

class Solution {
	static int Answer;

	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt(); // 테스트케이스 개수 출력

		for (int test_case = 0; test_case < T; test_case++) {

			int N = Integer.parseInt(sc.next()); // 사과의 총개수
			int A = Integer.parseInt(sc.next()); // A 바구니에 들어갈 수 있는 총 개수
			int B = Integer.parseInt(sc.next()); // B 바구니에 들어갈 수 있는 총 개수

			// 최소값 생성
			int low = 0;
			if (A < B) {
				low = A;
			} else {
				low = B;
			}

			switch (test_case) {
			////// case 1번 //////
			case 0:
				if ((N % low) < A) {
					int Bnum = ((N / low) - 1);
					int Anum = N - (low * Bnum); // 나머지값
					// Anum 개수 구하는방법
					if ((Anum % A) == 0) {
						Anum = Anum / A; // Anum깂
						Answer = Bnum + Anum; // 결과값 출력
					}
				}
				break;
			case 1:
				////// case 2번 //////
				if ((N % low) == 0) {
					int Anum = N / low;
					Answer = Anum;
				}
				break;
			case 2:
				////// case 3번 //////
				if ((N % low) < B) {
					int Anum = ((N / low) - 1); // 1
					int Bnum = N - (low * Anum);
					// Bnum 개수 구하는 방법
					if ((Bnum % B) == 0) {
						Bnum = Bnum / B;
						Answer = Anum + Bnum;
					}
				}
				break;
			case 3:
				////// case 4번 //////
				if (N == A) {
					int num = (N / A);
					Answer = num;
				} else {
					int num = (N / B);
					Answer = num;
				}
				break;
			}

			System.out.println("Case #" + (test_case + 1));
			System.out.println(Answer);
		}
	}
}