package Samsung;

import java.util.Scanner;

class Solution {
	static int Answer;

	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt(); // �׽�Ʈ���̽� ���� ���

		for (int test_case = 0; test_case < T; test_case++) {

			int N = Integer.parseInt(sc.next()); // ����� �Ѱ���
			int A = Integer.parseInt(sc.next()); // A �ٱ��Ͽ� �� �� �ִ� �� ����
			int B = Integer.parseInt(sc.next()); // B �ٱ��Ͽ� �� �� �ִ� �� ����

			// �ּҰ� ����
			int low = 0;
			if (A < B) {
				low = A;
			} else {
				low = B;
			}

			switch (test_case) {
			////// case 1�� //////
			case 0:
				if ((N % low) < A) {
					int Bnum = ((N / low) - 1);
					int Anum = N - (low * Bnum); // ��������
					// Anum ���� ���ϴ¹��
					if ((Anum % A) == 0) {
						Anum = Anum / A; // Anum��
						Answer = Bnum + Anum; // ����� ���
					}
				}
				break;
			case 1:
				////// case 2�� //////
				if ((N % low) == 0) {
					int Anum = N / low;
					Answer = Anum;
				}
				break;
			case 2:
				////// case 3�� //////
				if ((N % low) < B) {
					int Anum = ((N / low) - 1); // 1
					int Bnum = N - (low * Anum);
					// Bnum ���� ���ϴ� ���
					if ((Bnum % B) == 0) {
						Bnum = Bnum / B;
						Answer = Anum + Bnum;
					}
				}
				break;
			case 3:
				////// case 4�� //////
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