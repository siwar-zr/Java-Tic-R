package models;

public class Mobile {
    public String brand;
    public int price;
    public static String name;

    static
    {
        name = "Ph";
        System.out.println("In static block...");
    }

    public Mobile(){
        System.out.println("In constructor...");
    }

    public Mobile(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public void affiche(){
        System.out.println(brand +" : "+ price + " : "+ name);
    }

    public static void affiche2(Mobile obj){

        System.out.println(obj.brand +" : "+ obj.price + " : "+ name);
    }
}
