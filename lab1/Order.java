package lab1;

import java.util.Date;

public class Order {
    public static Date deliveryDate; //???
    private final String OrderID;
    private Client client;
    private String status;
    private Staff staff;
    private double cost;
    private Date orderDate;

    //private String deliveryMethod;


    public Order(String orderID) {
        OrderID = orderID;

    }

    public Client getClient() {
        return client;
    }

    public Staff getStaff() {
        return staff;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
}
