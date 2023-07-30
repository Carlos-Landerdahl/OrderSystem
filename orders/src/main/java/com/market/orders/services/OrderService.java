package com.market.orders.services;
import com.market.orders.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    public Double total(Order order) {
        double discountAmount = (order.() * order.getDiscount()) / 100;
        double total = order.getPrice() - discountAmount;

        System.out.println("O valor total da compra após aplicar o desconto é: " + total);
        return total;
    }
}