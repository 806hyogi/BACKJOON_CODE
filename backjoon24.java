package backjoon;

import java.util.*;

public class backjoon24 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int inputData1 = Integer.parseInt(sc.next()); //5
		int inputData2 = Integer.parseInt(sc.next()); //4
		

		int Data[] = new int[inputData1+1]; //6
		int ExData[] = new int[inputData1]; // 임시데이터
				
		for(int i = 0; i < inputData1; i++) {
			Data[i] = i + 1; // 1 2 3 4 5
		}


		
		for(int i = 0; i < inputData2; i++) { // 0 1 2 3
			int inputData3 = Integer.parseInt(sc.next()); //1
			int inputData4 = Integer.parseInt(sc.next()); //4

			for(int j = 0; j < inputData4; j++) { // 0 1 2 3
				
				ExData[j] = Data[inputData4-j]; // ExData[j] = 1 2 3 4
				
			}
			for(int k = 0; k < inputData4; k++) {
				
				Data[k+inputData3] = ExData[k];
			}

		}
		
		for(int i = 0; i < Data.length-1; i++) {
			System.out.print(Data[i] + " ");
		}
	}

}
