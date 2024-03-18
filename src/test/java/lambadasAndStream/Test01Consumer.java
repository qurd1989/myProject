package lambadasAndStream;


import lambdasAndStream.Consumer01;
import org.junit.Test;

import javax.annotation.processing.SupportedAnnotationTypes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import static org.hamcrest.MatcherAssert.assertThat;

public class Test01Consumer {

    @Test
    public void Consumer01(){

        Consumer<List<String>> consumer = List::clear;
        List<String> s = new ArrayList<>(Arrays.asList("a", "B", "t", "rer"));
        consumer.accept(s);
      assert(s).isEmpty();

    }

}
