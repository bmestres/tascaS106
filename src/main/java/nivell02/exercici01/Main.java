package nivell02.exercici01;

import java.util.ArrayList;

public class Main {

    public static void main(String[]args){

        Person a = new Person("George", "Clinton", 42);
        String b = "Test";
        ArrayList<Person>c = new ArrayList<>();
        c.add(a);

        GenericMethods.printElements(a, b, c);
    }
}
