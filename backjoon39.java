package backjoon;

import java.util.Scanner;

public class backjoon39 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String arr[][] = new String[5][1];

      for (int i = 0; i < 5; i++) {

         for (int j = 0; j < 1; j++) {

            arr[i][j] = sc.nextLine();

         }
      }

      for (int k = 0; k < 15; k++) {

         for (int i = 0; i < 5; i++) {

            for (int j = 0; j < arr[i].length; j++) {
               
               if (k < arr[i][j].length()) { // 해당 단어의 길이 체크
                  System.out.print(arr[i][j].charAt(k));
               }
            }
         }
      }

   }

}