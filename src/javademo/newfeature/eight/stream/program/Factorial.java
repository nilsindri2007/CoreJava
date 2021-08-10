package javademo.newfeature.eight.stream.program;

import java.util.stream.LongStream;

public class Factorial {
    public static void main (String[]  args){
        long n =5;
        System.out.println(LongStream.rangeClosed(1,n)
                                    .reduce(1,(long a,long b)-> a*b));
    }
}
