import java.util.Scanner; 

public class ThresholdNum {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int[] userValues = new int[20];   // List of integers from input

      /* Type your code here. */
      int numInt = scnr.nextInt();
      
      for (int i = 0; i < numInt; i++) {
         userValues[i] = scnr.nextInt();
      }
      
      int thresholdVal = scnr.nextInt();
      
      for (int i = 0; i < numInt; i++) {
         if (userValues[i] < thresholdVal) {
            System.out.print(userValues[i] + ",");
         }
      }
      System.out.print("\n");
   }
}
