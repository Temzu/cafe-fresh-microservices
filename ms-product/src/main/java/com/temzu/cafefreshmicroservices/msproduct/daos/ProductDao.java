package com.temzu.cafefreshmicroservices.msproduct.daos;

import com.temzu.cafefreshmicroservices.msproduct.entities.Category;
import com.temzu.cafefreshmicroservices.msproduct.entities.Product;
import java.util.List;
import java.util.Set;
import org.springframework.data.domain.Page;

public interface ProductDao {

  Page<Product> findPage(int page, int pageSize);

  Page<Product> findPageByCategory(Category category, int page, int pageSize);

  List<Product> findAllByIdIsIn(List<Long> ids);

  Set<Product> findAll();

  Product findById(Long id);

  boolean existById(Long id);

  Product saveOrUpdate(Product product);

  void deleteById(Long id);
}
