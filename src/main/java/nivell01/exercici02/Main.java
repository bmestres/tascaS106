package nivell01.exercici02;

public class Main {

    public static void main(String[]args){

        Person person = new Person("George", "Clinton", 47);
        String city = "Atlanta";
        int year = 1979;
        GenericMethods.printElements(person, city, year);
    }
}
