package org.example;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class Customer
{
    String name;
    String address;
    List<Order> orders = new ArrayList<>();
    public Customer(String name, String address)
    {
        this.name = name;
        this.address = address;
    }
    public void addOrder(Order order)
    {
        orders.add(order);
    }
}

