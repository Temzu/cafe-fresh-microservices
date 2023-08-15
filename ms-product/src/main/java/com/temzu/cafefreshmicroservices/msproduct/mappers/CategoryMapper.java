package com.temzu.cafefreshmicroservices.msproduct.mappers;

import com.temzu.cafefreshmicroservices.msproduct.entities.Category;
import com.temzu.cafefreshmicroservices.routinglib.dtos.CategoryDto;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CategoryMapper {

  private final ModelMapper mapper;

  public CategoryDto toCategoryDto(Category category) {
    return mapper.map(category, CategoryDto.class);
  }

//  public Category toCategory(CategoryCreateDto categoryCreateDto) {
//    return mapper.map(categoryCreateDto, Category.class);
//  }
//
//  public Category toCategory(CategoryUpdateDto categoryUpdateDto) {
//    return mapper.map(categoryUpdateDto, Category.class);
//  }
}
