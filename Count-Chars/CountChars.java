import java.util.Scanner;

public class CountChars {
   public static void main(String[] args) {
      /* Type your code here. */
      char targetChar;
      String inputStr;
      int counter;
      
      Scanner scnr = new Scanner(System.in);
      targetChar = scnr.next().charAt(0);
      inputStr = scnr.nextLine();
      
      counter = 0;
      for (int i = 0; i < inputStr.length(); ++i) {
         if (inputStr.charAt(i) == targetChar) {
            counter += 1;
         }
      }
      
      if (counter == 1) {
         System.out.println(counter + " " + targetChar);
      }
      else {
         System.out.println(counter + " " + targetChar + "'s");
      }
   }
}
