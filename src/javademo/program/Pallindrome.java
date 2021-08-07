package javademo.program;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Pallindrome {

    public static void  checkPallindrom(String s){
        Integer value=Integer.parseInt(s);
        int r , sum=0 ,temp;
        temp=value;
        while (value > 0){
            r=value%10;
            sum=(sum*10)+r;
            value=value/10;
        }
        if(temp==sum){
            System.out.println("Pallindrome number");
        } else {
            System.out.println("Not Pallindrome number");
        }

    }
    public static void main (String[] args ) throws  Exception{
        InputStreamReader isr= new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(isr);
        System.out.println("Enter the String to check pallindrome");
        String str=br.readLine();
        checkPallindrom(str);


    }

}
