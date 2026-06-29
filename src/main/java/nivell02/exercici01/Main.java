package nivell02.exercici01;

import java.util.ArrayList;

public class Main {

    public static void main(String[]args){

        String a = "Test";

        Person b = new Person("George", "Clinton", 42);

        ArrayList<Person> c = new ArrayList<>();
        c.add(b);

        GenericMethods.printElements(a, b, c);
    }
}
