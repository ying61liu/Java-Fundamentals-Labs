import java.util.Scanner;

public class NumsReversed {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int[] userList = new int[20];   // List of numElement integers specified by the user
      int numElements;                // Number of integers in user's list
      // Add more variables as needed
      int i;

      numElements = scnr.nextInt();   // Input begins with number of integers that follow
      
      /* Type your code here. */
      i = 0;
      while (i < numElements) {
         userList[i] = scnr.nextInt();
         i++;
      }
      
      for (i = numElements - 1; i >= 0; i--) {
         if (userList[i] != 0) {
            System.out.print(userList[i] + ",");
         }
      }
      
      System.out.print("\n");
         
   }
}
