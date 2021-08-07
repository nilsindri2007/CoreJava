import java.util.HashMap;
import java.util.*;
import java.util.PriorityQueue;

public class Test {


       public  void sum (Integer a){
           System.out.println("Integer");
       }
      public  void sum (int a){
        System.out.println("Object");
        }

        public static void main(String[] args) {
           Test t=new  Test();
           t.sum(null);
        }
    }
