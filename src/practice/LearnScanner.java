package practice;


import java.util.Scanner;

public class LearnScanner {
    //scanner is a class from Jdk which take from user


    public static void main(String[] args) {
        //classname inputname = new constructor();
        Scanner input=new Scanner(System.in);
        System.out.println("enter your name");
        String name = input.nextLine();
        System.out.println("my name is "+name);

        System.out.println("enter your age ");
        int age = input.nextInt();
        System.out.println("my age is "+age);

        System.out.println("yes present in class");
        boolean yespresentinclass=input.nextBoolean();
        System.out.println(" student is present "+yespresentinclass);


        // close scanner object

        input.close();






    }




}
