package com.temzu.cafefreshmicroservices.corelib.repositories;

import com.temzu.cafefreshmicroservices.corelib.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}
