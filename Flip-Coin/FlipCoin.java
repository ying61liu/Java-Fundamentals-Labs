import java.util.Scanner;
import java.util.Random;

public class FlipCoin {
   
   // TODO: Define your method here
   public static String coinFlip(Random rand) {
      int randInt = rand.nextInt(2);
      
      if (randInt == 1) {
         return "Heads";
      }
      else {
         return "Tails";
      }
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Random rand = new Random(2); // Unique seed
      
      // TODO: Complete main here
      int numFlip = scnr.nextInt();
      String result;
      
      for (int i = 0; i < numFlip; i++) {
         result = coinFlip(rand);
         System.out.println(result);
      }
   }
}
