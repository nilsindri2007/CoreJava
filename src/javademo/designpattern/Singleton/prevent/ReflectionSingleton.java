package javademo.designpattern.Singleton.prevent;

import javademo.designpattern.Singleton.type.EagerInitSingleton;

import java.lang.reflect.Constructor;

public class ReflectionSingleton {

    public static void main (String [] args){
        EagerInitSingleton singleton= EagerInitSingleton.getInstance();
        EagerInitSingleton singleton1=null;
        try {
            Constructor[] constructors= EagerInitSingleton.class.getDeclaredConstructors();
            for (Constructor constructor:constructors){
                constructor.setAccessible(true);
                singleton1=(EagerInitSingleton)constructor.newInstance();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("singleton hashcode -> "+ singleton.hashCode());
        System.out.println("singleton1 hashcode -> "+ singleton1.hashCode());
   /*      -  enums are used because java ensures internally that enum value is instantiated only once.
           - java Enums are globally accessible
           -they can be used for singletons.
            - Its only drawback is that it is not flexible i.e it does not allow lazy initialization.*/
    }
}

