
import java.util.Scanner;

public class backjoon15 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int inputdata = sc.nextInt(); // 11
		int[]array = new int[inputdata]; // 10공간만큼 배열크기 생성
		
		for (int i = 0; i < inputdata; i++) { //0~10
			
									 // array
								     // 0 1 2 3 4 5 6 7 8 9 10
			array[i] = sc.nextInt(); // 1 4 1 2 4 2 4 2 3 4 4
		}
		
		int count = 0;
		
		int inputdata3 = sc.nextInt(); // 2
		
		for(int j = 0; j < inputdata; j++) {

			if(array[j] == inputdata3) {
					
				count++;
				
				continue;
				
			}
			
		}
		
		System.out.println(count);
	}
	
}
