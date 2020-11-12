package practice;

import java.util.Scanner;

public class ScannerException {        // exception handling using try catch, to be confirmed next week
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("insert the first number: ");
        int a = scanner.nextInt();


        System.out.println("insert the second number: ");
        int b = scanner.nextInt();

        int c = a + b;
        System.out.println(" the total: " + c);


    }


}







