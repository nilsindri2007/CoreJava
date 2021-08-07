package javademo.collection.List;

import java.util.*;

public class ListSortDemo {

    public static void main (String[] args){
        List<String> names = Arrays.asList("Alex", "Charles", "Brian", "David");

        //Natural order
        Collections.sort(names);    //[Alex, Brian, Charles, David]

       //Reverse order
        Collections.sort(names, Collections.reverseOrder());   // [David, Charles, Brian, Alex]
    }
}
