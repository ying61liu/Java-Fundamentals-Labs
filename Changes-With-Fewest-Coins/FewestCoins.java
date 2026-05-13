import java.util.Scanner; 

public class FewestCoins {
   public static void main(String[] args) {
      int userPaid;
      int dollars;
      int quarters;
      int dimes;
      int nickels;
      int pennies;
      
      Scanner scnr = new Scanner(System.in);
      userPaid = scnr.nextInt();
      
      if (userPaid == 0) {
         System.out.println("No change");
      }
      else {
         dollars = userPaid / 100;
         if (dollars > 0) {
            if (dollars == 1) {
               System.out.println("1 Dollar");
            }
            else if (dollars > 1) {
                  System.out.println(dollars + " Dollars");
            }
         }
         
         userPaid = userPaid - dollars * 100;
         quarters = userPaid / 25;
         if (quarters > 0) {
            if (quarters == 1) {
               System.out.println("1 Quarter");
            }
            else if (quarters > 1) {
               System.out.println(quarters + " Quarters");
            }
         }
         
         userPaid = userPaid - quarters * 25;
         dimes = userPaid / 10;
         if (dimes > 0) {
            if (dimes == 1) {
               System.out.println("1 Dime");
            }
            else if (dimes > 1) {
               System.out.println(dimes + " Dimes");
            }
         }
         
         userPaid = userPaid - dimes * 10;
         nickels = userPaid / 5;
         if (nickels > 0) {
            if (nickels == 1) {
               System.out.println("1 Nickel");
            }
            else if (nickels > 1) {
               System.out.println(nickels + " Nickels");
            }
         }
         
         userPaid = userPaid - nickels * 5;
         pennies = userPaid;
         if (pennies > 0) {
            if (pennies == 1) {
               System.out.println("1 Penny");
            }
            else if (pennies > 1) {
               System.out.println(pennies + " Pennies");
            }
         }
         
      }
   }
}
