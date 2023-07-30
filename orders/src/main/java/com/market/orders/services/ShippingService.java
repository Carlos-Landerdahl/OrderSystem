package com.market.orders.services;
import com.market.orders.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    public void shipment(Order order) {
        if (order.getBasic() < 100.0) {
            order.setBasic(20D);
            System.out.println("Frete de: 20 reais");
        }

        if (order.getBasic() >= 100.0 && order.getBasic() <= 200.0) {
            order.setBasic(12D);
            System.out.println("Frete de: 12 reais");
        }

        if (order.getBasic() >= 200.0) {
            order.setBasic(0.0);
            System.out.println("Frete de: 0 reais");
        }
    }
}