package javademo.newfeature.eight.stream.program;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNumber {
    public static void main (String[] args ){
        int number=300000;
        List<Integer> primeNumbers=
                IntStream
                        .range(2,number)
                        .filter(num->IntStream.range(2,num)
                                .noneMatch(divider -> num %divider ==0))
                                .boxed()
                                .collect(Collectors.toList());
        System.out.println(primeNumbers);

    }
}
