package com.catalog.resource;

import com.catalog.bean.Orders;
import com.catalog.service.OrderServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/orders")
public class OrderResource {
    @Autowired
    OrderServiceInterface orderService;

    @PostMapping(produces = "Application/json", consumes = "Application/json")
    Orders saveOrder(@RequestBody Orders order)
    {
        return orderService.createOrder(order);
    }

    @GetMapping(path = "/{id}", produces = "Application/json")
    Orders getOrderById(@PathVariable("id") Long id)
    {
        return orderService.findOrderById(id);
    }
}
