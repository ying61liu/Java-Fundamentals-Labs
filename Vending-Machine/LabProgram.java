import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      /* Type your code here. */ 
      int bottlesPurchased = scnr.nextInt();
      int bottlesRestocked = scnr.nextInt();
      
      VendingMachine sampleVM = new VendingMachine();
      
      sampleVM.purchase(bottlesPurchased);
      sampleVM.restock(bottlesRestocked);
      
      sampleVM.report();
   }
}
