package nivell01.exercici01;

public class Main {
    public static void main(String[]args){
        NoGenericMethods m1 = new NoGenericMethods("no", "particular", "order");
        NoGenericMethods m2 = new NoGenericMethods("order", "no", "particular");

        System.out.printf("%s, %s, %s\n", m1.getElem01(), m1.getElem02(), m1.getElem03());
        System.out.printf("%s, %s, %s\n", m2.getElem01(), m2.getElem02(), m2.getElem03());
    }
}
