package javademo.designpattern.creational.Factory;

public class SMSNotification implements  Notification{
    @Override
    public void notifyUser() {
        System.out.println("Sending SMSNotification");
    }
    }