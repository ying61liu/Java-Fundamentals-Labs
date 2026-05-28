import java.util.Scanner;

public class WordFrequencies {

   /* Define your method here */
   public static int getWordFrequency(String[] wordsList, int listSize, String currWord) {
      String[] copyList = new String[listSize];
      
      for (int i = 0; i < listSize; i++) {
         copyList[i] = wordsList[i].toLowerCase();
      }   
      
      int wordFreq = 0;
      for (int i = 0; i < listSize; i++) {
         if (copyList[i].equals(currWord.toLowerCase())) {
            wordFreq++;
         }
      }
      return wordFreq;
   }

   public static void main(String[] args) {
      /* Type your code here. */
      Scanner scnr = new Scanner(System.in);
      String[] userArr = new String[20];
      int userArrSize = scnr.nextInt();
      
      for (int i = 0; i < userArrSize; i++) {
         userArr[i] = scnr.next();
      }
      
      int currentWordFreq;
      for (int i = 0; i < userArrSize; i++) {
         currentWordFreq = getWordFrequency(userArr, userArrSize, userArr[i]);
         System.out.println(userArr[i] + " " + currentWordFreq);
      }
   }
}
