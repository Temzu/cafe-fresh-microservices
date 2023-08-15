package com.temzu.cafefreshmicroservices.msproduct.repositories;

import com.temzu.cafefreshmicroservices.msproduct.entities.Category;
import java.util.Optional;
import java.util.Set;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

  Set<Category> findAllBy();

  Page<Category> findAllByActiveStatusTrue(Pageable pageable);

  Optional<Category> findByTitle(String title);
}
