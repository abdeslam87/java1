package oop;

public class PeopleNtechExecution {

    public static void main(String[] args) {

        PeopleNtech object = new PeopleNtech();
        object.setinformationsofstudents("abdeslam", "PA", "male");


        System.out.println(object.getname());
        System.out.println(object.getLocation());
        System.out.println(object.getgender());


    }
}
