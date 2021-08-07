package javademo.collection.List;


// Java program to demonstrate the
// working of ArrayList in Java

import java.util.ArrayList;

class ArrayListDemo {
    public static void main(String[] args) {
        // Size of the ArrayList
        int n = 5;

        // Declaring the ArrayList withinitial size n
        ArrayList<Integer> arrli= new ArrayList<Integer>(n);

        // Appending new elements at the end of the list
        for (int i = 1; i <= n; i++)
            arrli.add(i);

        // Printing elements
        System.out.println(arrli);

        // Remove element at index 3
        arrli.remove(3);

        // Displaying the ArrayList
        // after deletion
        System.out.println(arrli);

        // Printing elements one by one
        for (int i = 0; i < arrli.size(); i++)
            System.out.print(arrli.get(i) + " ");

        for (Integer i :arrli  ) {
            System.out.print("using for each"+arrli.get(i) + " ");
        }
    }
}

