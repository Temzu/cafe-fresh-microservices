package com.temzu.cafefreshmicroservices.msproduct.services;

import com.temzu.cafefreshmicroservices.routinglib.dtos.CategoryCreateDto;
import com.temzu.cafefreshmicroservices.routinglib.dtos.CategoryDto;
import com.temzu.cafefreshmicroservices.routinglib.dtos.CategoryUpdateDto;
import java.util.Set;
import org.springframework.data.domain.Page;

public interface CategoryService {

  Set<CategoryDto> findAll();

  Page<CategoryDto> findPage(int page, int pageSize);

  Page<CategoryDto> findPageAll(int page, int pageSize);

  CategoryDto findById(Long id);

  CategoryDto findByTitle(String title);

  CategoryDto createCategory(CategoryCreateDto categoryCreateDto);

  void deleteById(Long id);

  CategoryDto update(CategoryUpdateDto categoryUpdateDto);

  void uploadCategoryImage(Long id, String imageUrl);
}
