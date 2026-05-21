import java.util.Scanner; 

public class BinaryConversion {
   public static void main(String[] args) {
      /* Type your code here. */
      int x;
      
      Scanner scnr = new Scanner(System.in);
      x = scnr.nextInt();
      
      while (x > 0) {
         System.out.print(x % 2);
         x = x / 2;
      }
      System.out.print("\n");
   }
}
