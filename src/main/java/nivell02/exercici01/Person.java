package nivell02.exercici01;

public class Person {

    String name;
    String surname;
    int age;

    public Person(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public String getSurname(){
        return this.surname;
    }

    public int getAge(){
        return this.age;
    }
    @Override
    public String toString() {
        return String.format("%s\n%s\n%d\n", this.name, this.surname, this.age);
    }
}