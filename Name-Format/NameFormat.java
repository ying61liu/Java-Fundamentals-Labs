import java.util.Scanner; 

public class NameFormat {
   public static void main(String[] args) {
      String userName;
      String[] fullName;
      String firstName;
      String middleName;
      String lastName;
      
      Scanner scnr = new Scanner(System.in);
      userName = scnr.nextLine();
      fullName = userName.split(" ");
      
      if (fullName.length == 3) {
         firstName = fullName[0];
         middleName = fullName[1];
         lastName = fullName[2];
         System.out.println(lastName + ", " + firstName.charAt(0) + "." + middleName.charAt(0) + ".");
         
      }
      else if (fullName.length == 2) {
         firstName = fullName[0];
         lastName = fullName[1];
         System.out.println(lastName + ", " + firstName.charAt(0) + ".");
      } 
   }
}
