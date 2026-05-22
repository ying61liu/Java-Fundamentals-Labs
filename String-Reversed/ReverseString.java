import java.util.Scanner;

public class ReverseString {
   public static void main(String[] args) {
      /* Type your code here. */
      String inputStr;
      char currentChar;
      
      Scanner scnr = new Scanner(System.in);
      inputStr = scnr.nextLine();
      
      while ((!inputStr.equals("Done")) && (!inputStr.equals("done")) && (!inputStr.equals("d"))) {
         for (int i = inputStr.length() - 1; i >= 0 ; --i) {
            currentChar = inputStr.charAt(i);
            System.out.print(currentChar);
         }
         System.out.print("\n");
         inputStr = scnr.nextLine();
      }
   }
}
