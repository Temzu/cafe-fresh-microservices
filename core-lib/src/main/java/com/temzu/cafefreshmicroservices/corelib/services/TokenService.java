package com.temzu.cafefreshmicroservices.corelib.services;

import com.temzu.cafefreshmicroservices.corelib.models.UserInfo;
import org.springframework.security.core.userdetails.UserDetails;

public interface TokenService {

  String generateTokenWithExpirationTime(UserInfo user);

  String extractUserName(String token);

  boolean isTokenValid(String token, UserDetails userDetails);

  void expireToken(String token);

  UserInfo parseToken(String token);

  Long getUserId(String token);
}
