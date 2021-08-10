package javademo.newfeature.eight.stream.program;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class PallindromString {

    public boolean isPalindromeUsingIntStream(String text) {
        String temp  = text.replaceAll("\\s+", "").toLowerCase();
        return IntStream.range(0, temp.length() / 2)
                .noneMatch(i -> temp.charAt(i) != temp.charAt(temp.length() - i - 1));
    }


    public static void main (String[] args ) throws  Exception{
        InputStreamReader isr= new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(isr);
        System.out.println("Enter the String to check pallindrome");
        String str=br.readLine();
        PallindromString p= new PallindromString();
        System.out.println("whether string is pallindrom -> "+p.isPalindromeUsingIntStream(str));


    }
}
