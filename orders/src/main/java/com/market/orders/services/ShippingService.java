package com.market.orders.services;
import com.market.orders.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    public void shipment(Order order) {
        double frete;
        if (order.getBasic() < 100.0) {
            frete = 20D;
            System.out.println("Frete de: 20 reais");
        } else if (order.getBasic() >= 100.0 && order.getBasic() <= 200.0) {
            frete = 12D;
            System.out.println("Frete de: 12 reais");
        } else {
            frete = 0.0;
            System.out.println("Frete de: 0 reais");
        }

        double newTotal = order.getBasic() + frete;
        order.setBasic(newTotal);
        System.out.println("Valor total: " + newTotal);
    }
}