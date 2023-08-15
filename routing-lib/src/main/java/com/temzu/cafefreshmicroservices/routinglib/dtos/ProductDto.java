package com.temzu.cafefreshmicroservices.routinglib.dtos;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class ProductDto {

  private Long id;

  private String title;

  private String imageSource;

  private BigDecimal price;

  private String description;

  private String categoryTitle;

}
