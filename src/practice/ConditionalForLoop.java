package practice;

public class ConditionalForLoop {        // using condition inside for loop

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i == 2) {
                System.out.println("i is my lucky number: " + i);
            } else {
                System.out.println("i is not my lucky number: " + i);
            }

        }
    }
}
// so in conditions we have some symbols to use
//  ||--> or
// & --> and
// == --> equals
// !== --> not equals
