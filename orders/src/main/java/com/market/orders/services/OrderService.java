package com.market.orders.services;
import com.market.orders.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    public Double total(Order order) {
        double total = order.getBasic() + order.getDiscount();
        System.out.println("O valor total da compra é: " + total);
        return total;
    }
}