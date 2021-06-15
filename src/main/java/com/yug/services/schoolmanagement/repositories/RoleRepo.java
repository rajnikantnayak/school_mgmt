package com.yug.services.schoolmanagement.repositories;

import com.yug.services.schoolmanagement.entity.RoleEntity;
import com.yug.services.schoolmanagement.entity.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepo extends JpaRepository<RoleEntity, Integer> {

    Optional<RoleEntity> findByName(Roles name);
}
