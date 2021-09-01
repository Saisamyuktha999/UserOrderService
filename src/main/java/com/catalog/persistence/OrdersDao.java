package com.catalog.persistence;

import com.catalog.bean.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersDao extends JpaRepository<Orders, Long> {
    Orders getOrdersById(Long id);
}
