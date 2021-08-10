package javademo.program;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PallindromString {
    public boolean   checkPallindrom(String input){

        String clean=input.replaceAll("\\s+","").toLowerCase();
        int length=clean.length();
        int forward=0;
        int backward=length-1;
        while (backward> forward){
            char forwardChar=clean.charAt(forward);
            char backwardChar=clean.charAt(backward);
            if(forwardChar !=backwardChar){
                return false;
            }
        }
        return true;

    }


    public static void main (String[] args ) throws  Exception{
        InputStreamReader isr= new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(isr);
        System.out.println("Enter the String to check pallindrome");
        String str=br.readLine();
        PallindromString p= new PallindromString();
        System.out.println("whether string is pallindrom -> "+p.checkPallindrom(str));


    }
}
