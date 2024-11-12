package org.example;
import java.util.Date;
public class Main{
    public static void main(String[] args) {
        Customer customer1 = new Customer("Vimal", "Hyderabad");
        Item item1 = new Item(25, "Rice");
        Item item2 = new Item(15, "Maize");
        Order order1 = new Order(new Date(), "Processing");
        order1.addOrderDetail(new OrderDetail(5, "Taxable", item1));
        order1.addOrderDetail(new OrderDetail(20, "Non-Taxable", item2));
        customer1.addOrder(order1);
        Payment cash1 = new Cash(12500, 12500);
        Payment check1 = new Check(2250, "Vimal", "1001");
        Payment credit1 = new Credit(30000, "Vimal", "Savings", new Date());
        order1.addPayment(cash1);
        order1.addPayment(check1);
        order1.addPayment(credit1);
        customer1.orders.get(0).billClear();
    }
}
