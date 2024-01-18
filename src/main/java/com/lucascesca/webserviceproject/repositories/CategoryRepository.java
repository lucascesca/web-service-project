package com.lucascesca.webserviceproject.repositories;

import com.lucascesca.webserviceproject.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
