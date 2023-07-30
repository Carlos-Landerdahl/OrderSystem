package com.market.orders;

import com.market.orders.entities.Order;
import com.market.orders.services.OrderService;
import com.market.orders.services.ShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrdersApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;
	@Autowired
	private ShippingService shippingServices;

	public static void main(String[] args) {
		SpringApplication.run(OrdersApplication.class, args);
	}

	public void run(String... args) throws Exception {
		Order order = new Order(1034, 150D, 20D);
		orderService.total(order);
		shippingServices.shipment(order);
		System.out.println("Pedido código: " + order.getCode());
		System.out.println("----------------");

		Order order1 = new Order(2282, 800D, 10D);
		orderService.total(order1);
		shippingServices.shipment(order1);
		System.out.println("Pedido código: " + order1.getCode());
		System.out.println("----------------");

		Order order2 = new Order(1309, 95D, 0D);
		orderService.total(order2);
		shippingServices.shipment(order2);
		System.out.println("Pedido código: " + order2.getCode());
		System.out.println("----------------");
	}

}
