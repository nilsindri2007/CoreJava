package javademo.designpattern.Singleton.type;

public class StaticBlockSingleton {
    public static StaticBlockSingleton instance;

    private StaticBlockSingleton(){}

    static {
        instance=new StaticBlockSingleton();
    }

}
