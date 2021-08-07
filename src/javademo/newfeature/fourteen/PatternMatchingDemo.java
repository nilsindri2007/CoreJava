package javademo.newfeature.fourteen;

public class PatternMatchingDemo {

    public static void main (String args[]){
        Object obj = new Object();
        //java 14 Pattern Matching coe
        //if (obj instanceof String s)
        //earlier
        if (obj instanceof String) {        // instanceof
            String s = (String) obj;          // cast
            if("jdk14".equalsIgnoreCase(s)){
                //...
            }
        }else {
            System.out.println("not a string");
        }
    }


}
