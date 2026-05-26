import java.util.Scanner; 

public class WordFrequencies {
   public static void main(String[] args) {
      /* Type your code here. */
      Scanner scnr = new Scanner(System.in);
      String [] userWords = new String[20];
      
      int wordCount = scnr.nextInt();
      
      for (int i = 0; i < wordCount; i++) {
         userWords[i] = scnr.next();
         //System.out.println(userWords[i]);
      }
      
      for (int i = 0; i < wordCount; i++) {
         int counter = 0;
         for (int j = 0; j < wordCount; j++) {
            if (userWords[i].equals(userWords[j])) {
               counter++;
            }
         }
         System.out.println(userWords[i] + " - " + counter);
      }
   }
}
