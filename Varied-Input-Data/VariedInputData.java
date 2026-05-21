import java.util.Scanner; 

public class VariedInputData {
   public static void main(String[] args) {
      /* Type your code here. */
      int num;
      int maxNum;
      int totalSum;
      int counter;
      int averageNum;
      
      
      Scanner scnr = new Scanner(System.in);
      num = scnr.nextInt();
      
      totalSum = 0;
      maxNum = 0;
      counter = 0;
      
      while (num >= 0) {
         totalSum += num;
         counter += 1;
         if (num >= maxNum) {
            maxNum = num;
         }
         num = scnr.nextInt();
      }   
      
      System.out.print(maxNum + " ");
      System.out.printf("%.2f%n", (float) totalSum / counter);
   }
}
