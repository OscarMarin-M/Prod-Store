package com.example.storepractice.data.Repository;

import com.example.storepractice.domain.Entity.Category;
import com.example.storepractice.domain.Entity.Product;
import java.util.List;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, UUID> {
  List<Product> getByIsDeletedFalse();
}
