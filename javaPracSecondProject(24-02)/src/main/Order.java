/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Я
 */
public class Order extends Student {
    private int Id;
    private String order_name;
    private String courier_name;
    private String dateTime;
    private OrderType type;

    public Order(int Id, String Fam, String Name, String Department) {
        super(Id, Fam, Name, Department);
    }

   

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return order_name;
    }

    public void setName(String name) {
        this.order_name = name;
    }

    public String getCourier() {
        return courier_name;
    }

    public void setCourier(String courier) {
        this.courier_name = courier;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public OrderType getType() {
        return type;
    }

    public void setType(OrderType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Order{" + "Id=" + Id + ", order_name=" + order_name + ", courier_name=" + courier_name + ", dateTime=" + dateTime + ", type=" + type + '}';
    }

    
}
enum OrderType{
срочнЫй_заказ,
обычный_заказ
}
