import java.util.Scanner;

public class BubbleSort {

   /* Define your method here */
   public static void sortArray(int[] myArr, int arrSize) {
      int temp;
      boolean swapped = true;
      
      while (swapped) {
         swapped = false;
         for (int i = 1; i < arrSize; i++) {
            if (myArr[i-1] < myArr[i]) {
               temp = myArr[i-1];
               myArr[i-1] = myArr[i];
               myArr[i] = temp;
               swapped = true;
            }
         }
      }
   }

   public static void main(String[] args) {
      /* Type your code here. */
      Scanner scnr = new Scanner(System.in);
      final int arrMaxCapacity = 20;
      int[] userArr = new int[arrMaxCapacity];
      int userArrSize = scnr.nextInt();
      int i = 0;
      
      while ((scnr.hasNextInt()) && (userArrSize < arrMaxCapacity)) {
         userArr[i] = scnr.nextInt();
         i++;
      }
      
      sortArray(userArr, userArrSize);
      
      for (int j = 0; j < userArrSize; j++) {
         System.out.print(userArr[j] + ",");
      }
      System.out.print("\n");
   }
}
