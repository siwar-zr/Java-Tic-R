package Generics;

public class GenericsExemple {

    public static void main(String[] a){

        Printer<Integer> printer = new Printer<>(23);
        printer.print();

        Printer<Double> printerD = new Printer<>(35.5);
        printerD.print();

        Printer<String> printerS = new Printer<>("Hello");
        printerS.print();
    }
}
