package com.catalog.orderserviceproject;

import com.catalog.bean.OrderItem;
import com.catalog.bean.Orders;
import com.catalog.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication(scanBasePackages = "com.catalog")
@EnableJpaRepositories(basePackages = "com.catalog.persistence")
@EntityScan(basePackages = "com.catalog.bean")
public class OrderServiceProjectApplication implements CommandLineRunner {

	@Autowired
	OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

        List<OrderItem> orderItems = new ArrayList<>();
        orderItems.add(new OrderItem(101L,4,BigDecimal.valueOf(900.99)));
        orderItems.add(new OrderItem(102L,5,BigDecimal.valueOf(90.99)));
        orderItems.add(new OrderItem(103L,2,BigDecimal.valueOf(500.99)));
		orderService.createOrder(new Orders("cust1@gmail.com","address1",orderItems));
	}
}
