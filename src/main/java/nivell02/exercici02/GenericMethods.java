package nivell02.exercici02;

public class GenericMethods {
    @SafeVarargs
    public static <T> void printElements(T ... values){
        for(T elem : values){
            System.out.println(elem);
        }
    }
}
