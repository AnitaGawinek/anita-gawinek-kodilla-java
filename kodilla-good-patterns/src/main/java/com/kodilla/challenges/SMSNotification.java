package com.kodilla.challenges;

public class SMSNotification implements NotificationService {

    public void sendNotification(User user, Product product){
        System.out.println("Dear " + user.getFullName() + ", thank you for your order!");
    }
}
