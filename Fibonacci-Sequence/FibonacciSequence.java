import java.util.Scanner;

public class FibonacciSequence {
   
   public static int fibonacci(int n) {
      /* Type your code here. */  
      if (n < 0) {
         return -1;
      }
      else if (n == 0) {
         return 0;
      }
      else if (n == 1) {
         return 1;
      }
      else {
         int[] fibonacciArr = new int[n+1];
         
         fibonacciArr[0] = 0;
         fibonacciArr[1] = 1;
         
         for (int i = 2; i < n + 1; i++) {
            fibonacciArr[i] = fibonacciArr[i-1] + fibonacciArr[i-2];
         }
         
         return fibonacciArr[n];
      }
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int startNum;
      
      startNum = scnr.nextInt();
      System.out.println("fibonacci(" + startNum + ") is " + fibonacci(startNum));
   }
}