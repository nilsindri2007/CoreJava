package javademo.designpattern.creational.Singleton.type;

public class CloneSingleton  {
    public static void main (String[] args) throws CloneNotSupportedException {
        EagerInitSingleton instance1= EagerInitSingleton.getInstance();
        EagerInitSingleton instance2= (EagerInitSingleton)instance1.clone();
        System.out.println("instance1 hashcode-> "+instance1.hashCode());
        System.out.println("instance2 hashcode-> "+instance2.hashCode());
    }

}
