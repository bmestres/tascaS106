package nivell01.exercici01;

public class Main {

    public static void main(String[]args){

        OrderedPair<String, Integer> p1 = new OrderedPair<>("Even", 8);
        OrderedPair<String, String> p2 = new OrderedPair<>("hello", "world");

        OrderedPair<String, Box<Integer>> p =  new OrderedPair<>("primes", new Box<Integer>());

        // Parametrized type of Box<T>
        Box<Integer>intBox = new Box<>();

        NoGenericMethods m = new NoGenericMethods(21, 5, 1995);





    }

}
