package lambdasAndStream;


import java.util.function.Predicate;

public class Predicate01 {

    public static void main(String[] args) {
        Predicate<String> p = String::isEmpty;
        Predicate<String> pNot = p.negate();
        System.out.println("For Hello = " + pNot.test("Hello"));
        System.out.println("Empty String = " + pNot.test(" "));
    }
}
