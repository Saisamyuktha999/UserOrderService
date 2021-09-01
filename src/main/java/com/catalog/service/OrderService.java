package com.catalog.service;

import com.catalog.bean.Orders;
import com.catalog.persistence.OrdersDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService implements OrderServiceInterface{
    @Autowired
    OrdersDao ordersDao;

    @Override
    public Orders createOrder(Orders orders) {
        return ordersDao.save(orders);
    }

    @Override
    public Orders findOrderById(Long id) {
        return ordersDao.getOrdersById(id);
    }
}
