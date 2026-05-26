import java.util.Scanner; 

public class MiddleItem {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int[] userValues = new int[9];  // Set of data specified by the user 
      int userVal;
      boolean hasTooManyNums = false;
      
      userVal = scnr.nextInt();
      int i = 0;
      int counter = 0;

      while (userVal > 0) {
         if (counter < 9) {
            userValues[i] = userVal;
            i++;
            counter++;
            userVal = scnr.nextInt();
         }
         else {
            System.out.println("Too many numbers");
            hasTooManyNums = true;
            break;
         }
      }
      
      if (!hasTooManyNums) {
         System.out.println("Middle item: " + userValues[counter / 2]); 
      }
   }
}
