package nivell02.exercici01;

public class GenericMethods {

    public static <T, String, W> void printElements(T a, String b, W c){

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
