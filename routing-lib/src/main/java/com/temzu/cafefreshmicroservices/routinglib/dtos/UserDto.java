package com.temzu.cafefreshmicroservices.routinglib.dtos;

import lombok.Data;

@Data
public class UserDto {

  private String id;

  private String login;

  private String email;

  private String phone;

  private String name;

}
