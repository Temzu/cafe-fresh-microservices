package com.temzu.cafefreshmicroservices.msproduct.services.impl;

import com.temzu.cafefreshmicroservices.msproduct.daos.CategoryDao;
import com.temzu.cafefreshmicroservices.msproduct.mappers.CategoryMapper;
import com.temzu.cafefreshmicroservices.msproduct.services.CategoryService;
import com.temzu.cafefreshmicroservices.routinglib.dtos.CategoryCreateDto;
import com.temzu.cafefreshmicroservices.routinglib.dtos.CategoryDto;
import com.temzu.cafefreshmicroservices.routinglib.dtos.CategoryUpdateDto;
import java.util.Set;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

  private final CategoryDao categoryDao;
  private final CategoryMapper categoryMapper;

  @Override
  public Set<CategoryDto> findAll() {
    return categoryDao.findAll().stream()
        .map(categoryMapper::toCategoryDto)
        .collect(Collectors.toSet());
  }

  @Override
  public Page<CategoryDto> findPage(int page, int pageSize) {
    return categoryDao.findPage(page, pageSize).map(categoryMapper::toCategoryDto);
  }

  @Override
  public Page<CategoryDto> findPageAll(int page, int pageSize) {
    return categoryDao.findPageAll(page, pageSize).map(categoryMapper::toCategoryDto);
  }

  @Override
  public CategoryDto findById(Long id) {
    return categoryMapper.toCategoryDto(categoryDao.findById(id));
  }

  @Override
  public CategoryDto findByTitle(String title) {
    return null;
  }

  @Override
  public CategoryDto createCategory(CategoryCreateDto categoryCreateDto) {
    return null;
  }

  @Override
  public void deleteById(Long id) {}

  @Override
  public CategoryDto update(CategoryUpdateDto categoryUpdateDto) {
    return null;
  }

  @Override
  public void uploadCategoryImage(Long id, String imageUrl) {}
}
