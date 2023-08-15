package com.temzu.cafefreshmicroservices.msauth.daos;


import com.temzu.cafefreshmicroservices.corelib.models.Role;

public interface RoleDao {

  Role findByName(String name);
}
