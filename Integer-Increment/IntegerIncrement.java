import java.util.Scanner;

public class IntegerIncrement {
   public static void main(String[] args) {
      /* Type your code here. */
      int num1;
      int num2;
      
      Scanner scnr = new Scanner(System.in);
      num1 = scnr.nextInt();
      num2 = scnr.nextInt();
      
      if (num2 < num1) {
         System.out.println("Second integer can't be less than the first.");
      }
      else {
         while (num1 <= num2) {
            System.out.print(num1 + " ");
            num1 += 5;
         }
         System.out.print("\n");
      }
   }
}
