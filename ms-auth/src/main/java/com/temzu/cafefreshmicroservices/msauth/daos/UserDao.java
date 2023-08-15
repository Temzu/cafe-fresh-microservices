package com.temzu.cafefreshmicroservices.msauth.daos;


import com.temzu.cafefreshmicroservices.corelib.models.User;

public interface UserDao {

  User save(User user);

  User findByLogin(String login);

  User findByEmail(String email);

  User findByLoginAndPassword(String login, String password);

  User update(User user);

  void updatePass(String newPass, String currentUser);
}
