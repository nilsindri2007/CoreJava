package javademo.designpattern.Singleton.prevent;

import javademo.designpattern.Singleton.type.LazyInitDesignPattern;

import java.io.*;

public class SerializationSingleton {
    public static void main (String[] args) throws IOException, ClassNotFoundException {
        LazyInitDesignPattern instance1= LazyInitDesignPattern.getInstance();
        ObjectOutput out = new ObjectOutputStream( new FileOutputStream("file.txt"));
        out.writeObject(instance1);

        //deserialize from file to Object
        ObjectInput in = new ObjectInputStream(new FileInputStream("file.txt"));
        LazyInitDesignPattern instance2= (LazyInitDesignPattern) in.readObject();
        in.close();
        System.out.println("instance1 hashcode-> "+instance1.hashCode());
        System.out.println("instance2 hashcode-> "+instance2.hashCode());



    }

}
