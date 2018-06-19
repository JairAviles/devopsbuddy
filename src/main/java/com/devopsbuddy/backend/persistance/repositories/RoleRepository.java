package com.devopsbuddy.backend.persistance.repositories;

import com.devopsbuddy.backend.persistance.domain.backend.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Integer> {
}
