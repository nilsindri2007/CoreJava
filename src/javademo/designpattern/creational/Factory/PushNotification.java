package javademo.designpattern.creational.Factory;

public class PushNotification implements  Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending PushNotification");
    }
}
