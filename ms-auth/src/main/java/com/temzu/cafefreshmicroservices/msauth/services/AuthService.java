package com.temzu.cafefreshmicroservices.msauth.services;


import com.temzu.cafefreshmicroservices.corelib.models.User;
import com.temzu.cafefreshmicroservices.routinglib.dtos.AuthRequestDto;
import com.temzu.cafefreshmicroservices.routinglib.dtos.AuthResponseDto;
import com.temzu.cafefreshmicroservices.routinglib.dtos.SignUpRequestDto;

public interface AuthService {

  AuthResponseDto signUp(SignUpRequestDto signUpRequestDto);

  AuthResponseDto login(AuthRequestDto authRequestDto);

  void logout(String token);

  String returnToken(User user);
}
