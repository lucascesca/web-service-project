package com.lucascesca.webserviceproject.repositories;

import com.lucascesca.webserviceproject.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
