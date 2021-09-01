package com.catalog.service;

import com.catalog.bean.Orders;

public interface OrderServiceInterface {
    Orders createOrder(Orders orders);
    Orders findOrderById(Long id);
}
