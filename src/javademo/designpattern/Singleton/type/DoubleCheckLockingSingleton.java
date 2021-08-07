package javademo.designpattern.Singleton.type;

public class DoubleCheckLockingSingleton {
    private static DoubleCheckLockingSingleton instance;

    private DoubleCheckLockingSingleton(){}

    public static DoubleCheckLockingSingleton  getInstance(){

        if(instance== null){
            //synchronized block to remove overhead
            synchronized (DoubleCheckLockingSingleton.class){
                if(instance==null){
                    instance= new DoubleCheckLockingSingleton();
                }
            }
        }
        return instance;

    }

}
