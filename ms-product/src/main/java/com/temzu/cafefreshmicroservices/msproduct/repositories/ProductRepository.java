package com.temzu.cafefreshmicroservices.msproduct.repositories;

import com.temzu.cafefreshmicroservices.msproduct.entities.Category;
import com.temzu.cafefreshmicroservices.msproduct.entities.Product;
import java.util.List;
import java.util.Set;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

  Set<Product> findAllBy();

  Page<Product> findAllByCategoryAndActiveStatusTrue(Category category, Pageable pageable);

  List<Product> findAllByIdIsIn(List<Long> ids);
}
