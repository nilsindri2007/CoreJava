package javademo.program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class FibonaciiSeries {
    public static int fibonacci2(int input){
        if(input==1 || input==2){
            return 1;
        }
        else {
            return  fibonacci2(input-1)+ fibonacci2(input-2);
        }

    }

    public static void main (String[] args) throws IOException {
        InputStreamReader isr= new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(isr);
        System.out.println("Enter number upto which Fibonacci series to print:");
        String str=br.readLine();
        int number =Integer.parseInt(str);
        for(int i=1; i<=number; i++){
            //System.out.print(fibonacci2(i) +" ");
            }
        Stream.iterate(new int[]{0,1}, t-> new int[]{t[1],t[0]+t[1]})
                .limit(10)
                .map(t-> t[0])
                .forEach(x-> System.out.println(x));

    }
}
