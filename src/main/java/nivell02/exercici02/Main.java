package nivell02.exercici02;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("George", "Clinton", 78);
        Person person2 = new Person("Ray", "Davis", 53);
        Person person3 = new Person("Calvin", "Simon", 68);


        ArrayList<Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);

        GenericMethods.printElements(people, person3, 20);
    }
}
