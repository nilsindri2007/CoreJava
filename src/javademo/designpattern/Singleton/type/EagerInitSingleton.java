package javademo.designpattern.Singleton.type;


import java.io.ObjectInput;
import java.io.Serializable;

// Java code to create singleton class by Eager Initialization
public class EagerInitSingleton implements Serializable , Cloneable {

        // public instance initialized when loading the class
        private static final EagerInitSingleton instance = new EagerInitSingleton();

        private EagerInitSingleton()
        {
            // private constructor
        }
        public static EagerInitSingleton getInstance(){
            return instance;
        }
        //to prevent the singleton pattern from Serialization
        protected  Object readResolve(){
                return  instance;
        }

        @Override
        protected Object clone() throws  CloneNotSupportedException{
                return super.clone();
               // throw new CloneNotSupportedException();
        }



}
