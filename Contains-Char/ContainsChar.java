import java.util.Scanner;

public class ContainsChar {
   public static void main(String[] args) {
      /* Type your code here. */
      Scanner scnr = new Scanner(System.in);
      String [] userWords = new String[20];
      
      int wordCount = scnr.nextInt();
      
      for (int i = 0; i < wordCount; i++) {
         userWords[i] = scnr.next();
         //System.out.println(userWords[i]);
      }
      
      char targetChar = scnr.next().charAt(0);
      
      for (int i = 0; i < wordCount; i++) {
         int wordLen = userWords[i].length();
         for (int j = 0; j < wordLen; j++) {
            if (userWords[i].charAt(j) == targetChar) {
               System.out.print(userWords[i] + ",");
               break;
            }
         }
      }
      System.out.print("\n");
   }
}
