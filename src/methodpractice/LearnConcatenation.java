package methodpractice;

public class LearnConcatenation {


    static String FirstName = "james";
    static String lastname = "wiliam";
    static String fulname = FirstName + " " + lastname; // + is concatenation, to add space use " "
    static String studentid = "7788NY";
    String stname = "syed raza";  // now to call this we need to create the object


    public static void main(String[] args) {
        System.out.println("my fulname is: " + fulname);


        int num1 = 5;
        int num2 = 7;
        int sum = num1 + num2;
        System.out.println(num1 + num2);
        System.out.println(studentid + " " + FirstName);


        LearnConcatenation obj = new LearnConcatenation();
        System.out.println(obj.stname); //call by object name
        System.out.println("stname is " + obj.stname);


    }


}
