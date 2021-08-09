package javademo.designpattern.creational.Singleton.type;

import java.io.Serializable;

public class LazyInitDesignPattern  implements Serializable {
    private static LazyInitDesignPattern  instance;

    private LazyInitDesignPattern(){}

    public static LazyInitDesignPattern getInstance(){
        if(instance == null){
            instance= new LazyInitDesignPattern();
        }
        return instance;
    }
    //prevention method for Singleton DP from serialization
    protected  Object readResolve(){
        return instance;
    }
}
