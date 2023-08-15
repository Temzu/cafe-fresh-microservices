package com.temzu.cafefreshmicroservices.routinglib.dtos;

import lombok.Data;

@Data
public class CategoryDto {

  private Long id;

  private String title;

  private String imageSource;

  private String activeStatus;
}
