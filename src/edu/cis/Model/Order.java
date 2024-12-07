package edu.cis.Model;

public class Order {
    private String itemID;
    private String type;
    private String orderID;

    public Order(String menuItemId, String orderType, String orderId) {
        this.orderID = orderId;
        this.type = orderType;
        this.itemID = menuItemId;
    }
    public Order() {
    }

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    @Override
    public String toString() {
        return "Order{" +
                "itemID='" + itemID + '\'' +
                ", type='" + type + '\'' +
                ", orderID='" + orderID + '\'' +
                '}';
    }
}