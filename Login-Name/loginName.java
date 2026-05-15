import java.util.Scanner;

public class loginName {

	public static void main(String[] args) {

		/* Type your code here. */
		String firstName;
		String lastName;
		int birthYear;
		
		// get input data 
		Scanner scnr = new Scanner(System.in);
		firstName = scnr.next();
		lastName = scnr.next();
		birthYear = scnr.nextInt();
		
      // output the result
		System.out.print("Your login name: ");
		
		// output different results based on length of firstName 
		int len = firstName.length();
		if ( len >= 6) {
		   for (int i = 0; i < 6; i++) {
		      System.out.print(firstName.charAt(i));
		   }
		}
		else {
		   for (int i = 0; i < len; i++) {
		      System.out.print(firstName.charAt(i));
		   }
		}
		
		System.out.printf(lastName.charAt(0) + "_%d%n", birthYear % 10);
	}
}