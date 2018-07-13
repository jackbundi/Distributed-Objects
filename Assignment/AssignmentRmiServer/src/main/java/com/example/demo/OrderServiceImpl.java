package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class OrderServiceImpl implements OrderService {

    private List<Order>orders= new ArrayList<>();

    @Override
    public void placeOrder(Order order) {
        System.out.println("we have received a new  order"+ order.toString());
        orders.add(order);
    }

    @Override
    public List<Order> getOrder() {
        return orders;
    }
}
