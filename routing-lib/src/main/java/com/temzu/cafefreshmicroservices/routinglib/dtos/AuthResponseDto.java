package com.temzu.cafefreshmicroservices.routinglib.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuthResponseDto {

  private String token;
}
