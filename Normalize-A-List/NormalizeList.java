import java.util.Scanner; 

public class NormalizeList {
   public static void main(String[] args) {
      /* Type your code here. */
      Scanner scnr = new Scanner(System.in);
      float [] userValues = new float[20];
      float maxVal;
      
      int numVals = scnr.nextInt();
      
      for (int i = 0; i < numVals; i++) {
         userValues[i] = scnr.nextFloat();
      }
      
      maxVal = userValues[0];
      for (int i = 0; i < numVals; i++) {
         if (userValues[i] > maxVal) {
            maxVal = userValues[i];
         }
      }
      
      for (int i = 0; i < numVals; i++) {
         System.out.printf("%.2f ", userValues[i] / maxVal);
      }
      System.out.print("\n");
   }
}
