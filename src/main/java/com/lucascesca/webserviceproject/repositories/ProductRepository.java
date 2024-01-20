package com.lucascesca.webserviceproject.repositories;

import com.lucascesca.webserviceproject.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
