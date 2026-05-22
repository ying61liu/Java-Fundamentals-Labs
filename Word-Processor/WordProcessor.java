import java.util.Scanner;

public class WordProcessor {
   public static void main(String[] args) {
      /* Type your code here. */
      String inputStr;
      char currentChar;
      Scanner scnr = new Scanner(System.in);
      
      inputStr = scnr.nextLine();
      
      for (int i = 0; i < inputStr.length(); ++i) {
         currentChar = inputStr.charAt(i);
         if (Character.isAlphabetic(currentChar)) {
            System.out.print(currentChar);
         }
      }
      System.out.print("\n");
   }
}
