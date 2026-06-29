package nivell01.exercici01;

public class Main {

    public static void main(String[]args){
        NoGenericMethods m1 = new NoGenericMethods("no", "particular", "order");
        NoGenericMethods m2 = new NoGenericMethods("order", "no", "particular");

        System.out.println(m1);
        System.out.println(m2);
    }
}
