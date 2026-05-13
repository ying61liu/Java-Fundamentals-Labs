import java.util.Scanner;

public static void main(String[] args) {
    int num1;
    int num2;
    int num3;
      
    Scanner scnr = new Scanner(System.in);
    num1 = scnr.nextInt();
    num2 = scnr.nextInt();
    num3 = scnr.nextInt();
      
    if ((num1 < num2) && (num1 < num3)) {
        System.out.println(num1);
    }
    else {
        if (num2 < num3) {
        System.out.println(num2);
        }
        else {
        System.out.println(num3);
        }
    }
}

