package methodpractice;

public class RMadrid {

    public static void main(String[] args) {
        stadiumname();
        RMadrid object = new RMadrid();
        object.bestplayer();


    }

    // static method
    public static void stadiumname() {
        System.out.println("bernabeu");

    }

    // non static method
    public void bestplayer() {
        System.out.println("messi");

    }


}
