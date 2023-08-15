package com.temzu.cafefreshmicroservices.routinglib.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class AuthRequestDto {

  @NotBlank(message = "Email must not be blank and not be null")
  @Email
  private String email;

  @NotBlank(message = "Password must not be blank and not be null")
  @Size(min = 6, max = 80, message = "Password length must be between 6-80")
  private String password;
}
