package lab1;

import java.util.Date;

public class Delivery {
    private Order order;
    private DeliveryService deliveryService;
    private Date deliveryDate;


    public Date getDeliveryDate() {
        return Order.deliveryDate;
    }

    public DeliveryService getDeliveryService() {
        return deliveryService;
    }

    public Order getOrder() {
        return order;
    }
}
