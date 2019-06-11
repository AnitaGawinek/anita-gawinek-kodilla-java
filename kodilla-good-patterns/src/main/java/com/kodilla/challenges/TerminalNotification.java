package com.kodilla.challenges;

public class TerminalNotification implements NotificationService {

    public void sendNotification(User user, Product product){
        System.out.println("Notification was sent to: " + user.getFullName() + ", with info about ordered " + product.getName());
    }
}
