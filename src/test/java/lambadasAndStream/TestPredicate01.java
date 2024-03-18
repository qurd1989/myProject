package lambadasAndStream;

import java.util.function.Predicate;
import org.junit.*;

public class TestPredicate01 {
    @Test
         public void predicate_01() {
        Predicate<String> p = String::isEmpty;
        Predicate<String> notPredicate = p.negate();
    }
}
