package javademo.lang.strings;

public class StringBufferDemo {
    public static void main(String args[]){
        StringBuffer s = new StringBuffer("GeeksforGeeks");
        int p = s.length();
        int q = s.capacity();
        System.out.println("Length of string GeeksforGeeks=" + p);
        System.out.println("Capacity of string GeeksforGeeks=" + q);
    }

}
