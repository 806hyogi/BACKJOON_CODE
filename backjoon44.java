
import java.util.Scanner;

public class backjoon37 {

	public static void main(String[] args) {

		int k = 1;
		int q = 1;
		int r = 2;
		int b = 2;
		int n = 2;
		int p = 8;

		Scanner sc = new Scanner(System.in);

		int ink = Integer.parseInt(sc.next());
		int inq = Integer.parseInt(sc.next());
		int inr = Integer.parseInt(sc.next());
		int inb = Integer.parseInt(sc.next());
		int inn = Integer.parseInt(sc.next());
		int inp = Integer.parseInt(sc.next());

		int count[] = new int[7];

		if (ink != k) { // ink가 k와 같지 않은 경우
			while (ink > 1) {

				k = ink - 1;

				continue;
			}

			while (ink < 1) {
				k = ink + 1;
				continue;
			}
		}

	}

}
