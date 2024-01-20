package com.lucascesca.webserviceproject.repositories;

import com.lucascesca.webserviceproject.entities.OrderItem;
import com.lucascesca.webserviceproject.entities.pk.OrderItemPk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk> {
}
