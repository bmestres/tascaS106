package nivell01.exercici02;

public class Main {

    public static void main(String[]args){

        Person person = new Person("George", "Clinton", 82);
        GenericMethods.printElements(person.getName(), person.getSurname(), person.getAge());
    }
}
