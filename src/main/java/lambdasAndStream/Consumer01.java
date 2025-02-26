package lambdasAndStream;



import java.util.function.Consumer;
public class Consumer01{

    public static void main(String[] args) {

        Consumer<String> consumer = System.out::println;
        consumer .accept("hello Elmar");

    }
}
