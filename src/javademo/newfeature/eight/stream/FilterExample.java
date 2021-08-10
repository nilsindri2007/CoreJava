package javademo.newfeature.eight.stream;

import java.util.Arrays;
import java.util.List;

public class FilterExample {
    public static void main(String[] args){
        List<String> stringList = Arrays.asList("abc","cde","fgh","ijk");
        long count = stringList.stream() .filter(x -> x.isEmpty()) .count();
        System.out.println(count);





    }

}
