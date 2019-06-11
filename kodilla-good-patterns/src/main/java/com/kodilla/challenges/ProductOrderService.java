package com.kodilla.challenges;


public class ProductOrderService {
    private NotificationService notification;

    public ProductOrderService(NotificationService notification) {
        this.notification = notification;
    }

    public void order(final User user, final Product product){
        product.setAvailable(false);
        notification.sendNotification(user, product);
    }
}
