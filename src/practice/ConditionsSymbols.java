package practice;

public class ConditionsSymbols {
    public static void main(String[] args) {


        int a = 5;

        if (a == 5 || a > 6) {                 //   || means or
            System.out.println(a);
        }

        if (a == 5 && a > 4) {        // && means and
            System.out.println(a);

        }

        if (a != 4) {           // ! means is not equals
            System.out.println("ill be there at: " + a);
        }

        if (a == 5) {       //  == means equals
            System.out.println("the number of my sisters is: " + a);
        }

    }
}
