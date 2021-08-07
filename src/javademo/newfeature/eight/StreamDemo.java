package javademo.newfeature.eight;

import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;
import java.util.stream.*;
public class StreamDemo {

    public static void main (String[] args){

      //Stream of Collection
        Collection<String> collection = Arrays.asList("a", "b", "c");
        Stream<String> streamOfCollection = collection.stream();
        //Stream of Array
        String[] arr = new String[]{"a", "b", "c"};
        Stream<String> streamOfArrayFull = Arrays.stream(arr);
        //Stream builder
        Stream<String> streamBuilder = Stream.<String>builder().add("a").add("b").add("c").build();

        Stream<String> streamGenerated = Stream.generate(() -> "element").limit(10);

        IntStream intStream = IntStream.range(1, 3);
        LongStream longStream = LongStream.rangeClosed(1, 3);

        Stream<String> stream =
                Stream.of("a", "b", "c")
                        .filter(element -> element.contains("b"));
        Optional<String> anyElement = stream.findAny();

        Optional<String> firstElement = stream.findFirst();

    }

}
