import java.util.Scanner; 

public class HighwayNumbers {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); 
      int highwayNumber;
      int primaryNumber;

      highwayNumber = scnr.nextInt();
      
      /* Type your code here. */
      if ((highwayNumber <= 0) || (highwayNumber > 999)) {
         System.out.println(highwayNumber + " is not a valid interstate highway number.");
      }
      else {
         if (highwayNumber < 100) {
            System.out.print("I-" + highwayNumber + " is primary, going ");
            if (highwayNumber % 2 == 0) {
               System.out.println("east/west.");
            }
            else {
               System.out.println("north/south.");
            }
         }
         else {
            if (highwayNumber % 100 == 0) {
               System.out.println(highwayNumber + " is not a valid interstate highway number.");
            }
            else {
               primaryNumber = highwayNumber % 100;
               System.out.print("I-" + highwayNumber + " is auxiliary, serving I-" + primaryNumber + ", going ");
               if (highwayNumber % 2 == 0) {
                  System.out.println("east/west.");
               }
               else {
                  System.out.println("north/south.");
               }
            }
         }
      }
   }
}
