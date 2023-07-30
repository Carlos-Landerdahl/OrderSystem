package com.market.orders.services;
import com.market.orders.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    public void total(Order order) {
        double discountAmount = (order.getBasic() * order.getDiscount()) / 100;
        double total = order.getBasic() - discountAmount;
        order.setBasic(total);
    }
}