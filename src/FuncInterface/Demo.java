package FuncInterface;

@FunctionalInterface
interface A {
    int add(int i,int j);
}



public class Demo {

    public static void main(String a[]){

        A obj = (i,j)->i+j;



        int result = obj.add(2,5);
        System.out.println(result);
    }

}
