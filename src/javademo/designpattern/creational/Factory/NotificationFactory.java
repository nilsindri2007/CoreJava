package javademo.designpattern.creational.Factory;

public class NotificationFactory {
    public Notification createNotification(String channel){
        if(channel==null || channel.isEmpty()){
            return null;
        } else if("SMS".equals(channel)){
            return new SMSNotification();
        } else if("Email".equals(channel)){
            return new EmailNotification();
        }  else if("Push".equals(channel)){
            return new PushNotification();
        }
        return null;
    }

}
