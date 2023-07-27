package backjoon;

import java.util.Scanner;
import java.util.Arrays;

public class backjoon25 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int arrLen = Integer.parseInt(sc.nextLine());
		float arr[] = new float[arrLen+1];
		
		
		for(int i = 0; i < arr.length-1; i++) {
			arr[i] = Float.parseFloat(sc.next());
		}
		Arrays.sort(arr);
		float maxValue = arr[arr.length-1];


		float sum = 0;
		for(int j = 0; j < arr.length; j++) {
			arr[j] = ((arr[j] / maxValue)*100);
			sum += arr[j];


		}
		float avg = sum / arrLen;
		
		System.out.println(avg);
	}

}

