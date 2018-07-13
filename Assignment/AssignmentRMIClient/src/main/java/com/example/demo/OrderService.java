package com.example.demo;

import java.util.List;


public interface OrderService {
    void placeOrder(Order order);

    List<Order>getOrder();

}
