package javademo.hackerrank;

import java.io.*;

public class HackerRankTest {

        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int N = Integer.parseInt(bufferedReader.readLine().trim());
            for(int i=1 ;i<=N ;i++){
               // System.out.println(N+"x"+i= String.valueOf(N*i));
            }

            bufferedReader.close();
        }
}
