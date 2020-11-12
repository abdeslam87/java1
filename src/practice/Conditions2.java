package practice;

public class Conditions2 {              //conditions using string

    public static void main(String[] args) {
        String today = "";

        // sunday-- football
        //monday-- work
        //tuesday--school
        //wednesday--gym
        //else--tennis
        if (today.equalsIgnoreCase("monday")) {
            System.out.println("im working");
        } else if (today.equalsIgnoreCase("tuesday")) {
            System.out.println("im studying");
        } else if (today.equalsIgnoreCase("wednesday")) {
            System.out.println("going to the gym");

        } else {          // else without today.equalsIgnoreCase, just else{ and hit enter
            System.out.println("playing tennis");
        }


    }
}
