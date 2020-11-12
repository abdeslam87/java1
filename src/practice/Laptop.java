package practice;

public class Laptop { //parameterization of constructor
    protected int year;
    protected String model;

    public Laptop(int lastyear, String model) {
        this.year = lastyear;
        this.model = model;
    }

    public static void main(String[] args) {
        Laptop laptop = new Laptop(2020, "mac");
        laptop.PrintDetails();
        int value = laptop.AddYear(20);
        System.out.println(value);
    }

    public void PrintDetails() {
        System.out.println(year);
        System.out.println("model");
    }

    public int AddYear(int additional) {
        this.year = this.year + additional;
        return this.year;


    }
}









