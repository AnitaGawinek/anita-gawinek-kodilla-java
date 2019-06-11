package com.kodilla.challenges;

public class MailNotification implements NotificationService {

    public void sendNotification(User user, Product product){
        System.out.println("Dear " + user.getFullName() + ", you ordered "
                + product.getName() + ". \nThank you for your order!");
    }
}
