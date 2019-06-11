package com.kodilla.challenges;

public class Application {
    public static void main (String[] args){
        User user = new User("James", "Blond");
        Product product = new MobilePhone();
//        Product product = new Book();
//        NotificationService notification = new TerminalNotification();
//        NotificationService notification = new MailNotification();
        NotificationService notification = new SMSNotification();

        doOrder(user, product, notification);
    }

    public static void doOrder(User user, Product product, NotificationService notification){
        ProductOrderService orderService = new ProductOrderService(notification);
        orderService.order(user, product);
    }
}
