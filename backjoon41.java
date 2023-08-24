package backjoon;
import java.util.Scanner;
public class backjoon41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean a = true;
		while(a) {
			
			
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			if(num1 == num2) {
				a = false;
			}else if((num1 < num2) && (num2 % num1 == 0)) {
				System.out.println("factor");
			}else if((num1 > num2) && (num1 % num2 == 0)) {
				System.out.println("multiple");
			}else if((num1 % num2) != 0){
				System.out.println("neither");
			}
		}
	}

}
