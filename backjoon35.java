package backjoon;
import java.util.Scanner;
public class backjoon35 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int che[] = new int[6];
		
		che[0] = 1;
		che[1] = 1;
		che[2] = 2;
		che[3] = 2;
		che[4] = 2;
		che[5] = 8;
		
		
		
		int input1 = Integer.parseInt(sc.next());
		int input2 = Integer.parseInt(sc.next());
		int input3 = Integer.parseInt(sc.next());
		int input4 = Integer.parseInt(sc.next());
		int input5 = Integer.parseInt(sc.next());
		int input6 = Integer.parseInt(sc.next());
		
		int re[] = new int[6];
		
		re[0] = input1;
		re[1] = input2;
		re[2] = input3;
		re[3] = input4;
		re[4] = input5;
		re[5] = input6;
		
		
		int fi[] = new int[6];
		for(int i = 0; i < fi.length; i++) {
			fi[i] = che[i] - re[i];
			System.out.print(fi[i] + " ");
		}
	}

}
