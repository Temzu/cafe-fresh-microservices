package com.temzu.cafefreshmicroservices.msauth.services.impl;

import com.temzu.cafefreshmicroservices.corelib.models.User;
import com.temzu.cafefreshmicroservices.msauth.services.AuthService;
import com.temzu.cafefreshmicroservices.routinglib.dtos.AuthRequestDto;
import com.temzu.cafefreshmicroservices.routinglib.dtos.AuthResponseDto;
import com.temzu.cafefreshmicroservices.routinglib.dtos.SignUpRequestDto;

public class AuthServiceImpl implements AuthService {

  @Override
  public AuthResponseDto signUp(SignUpRequestDto signUpRequestDto) {
    return null;
  }

  @Override
  public AuthResponseDto login(AuthRequestDto authRequestDto) {
    return null;
  }

  @Override
  public void logout(String token) {

  }

  @Override
  public String returnToken(User user) {
    return null;
  }
}
