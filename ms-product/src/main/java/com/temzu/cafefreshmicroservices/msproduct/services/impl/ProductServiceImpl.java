package com.temzu.cafefreshmicroservices.msproduct.services.impl;

import com.temzu.cafefreshmicroservices.msproduct.daos.CategoryDao;
import com.temzu.cafefreshmicroservices.msproduct.daos.ProductDao;
import com.temzu.cafefreshmicroservices.msproduct.mappers.ProductMapper;
import com.temzu.cafefreshmicroservices.msproduct.services.ProductService;
import com.temzu.cafefreshmicroservices.routinglib.dtos.ProductDto;
import java.util.Set;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

  private final ProductDao productDao;
  private final ProductMapper productMapper;

  private final CategoryDao categoryDao;

  @Override
  public Page<ProductDto> findPage(Integer page, Integer pageSize) {
    return productDao.findPage(page, pageSize).map(productMapper::toProductDto);
  }

  @Override
  public Page<ProductDto> findPageByCategoryTitle(
      String categoryTitle, Integer page, Integer pageSize) {
    return productDao
        .findPageByCategory(categoryDao.findByTitle(categoryTitle), page, pageSize)
        .map(productMapper::toProductDto);
  }

  @Override
  public ProductDto findById(Long id) {
    return productMapper.toProductDto(productDao.findById(id));
  }

  @Override
  public Set<ProductDto> findAll() {
    return productDao.findAll().stream()
        .map(productMapper::toProductDto)
        .collect(Collectors.toSet());
  }

  @Override
  public void deleteById(Long id) {}
}
