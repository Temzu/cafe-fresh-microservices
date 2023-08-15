package com.temzu.cafefreshmicroservices.routinglib.dtos;

import java.math.BigDecimal;
import java.util.List;
import lombok.Data;

@Data
public class OrderDto {

  private Long id;

  private String address;

  private String phone;

  private BigDecimal price;

  private String orderStatus;

  private String orderType;

  private List<OrderItemDto> items;
}
