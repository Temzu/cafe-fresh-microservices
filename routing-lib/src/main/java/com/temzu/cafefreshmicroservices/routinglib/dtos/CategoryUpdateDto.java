package com.temzu.cafefreshmicroservices.routinglib.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CategoryUpdateDto {

  @NotNull(message = "Category id must be not null")
  private Long id;

  @NotBlank(message = "Title must not be blank and not be null")
  @Size(min = 3, max = 20, message = "Title length must be between 3-20")
  @Pattern(regexp="^[А-Яа-я\\d]*$", message = "Title contains invalid characters")
  private String title;
}
