package com.mcb.bankpropertyevaluation.dao.repository;


import com.mcb.bankpropertyevaluation.dao.entity.Role;
import com.mcb.bankpropertyevaluation.dao.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(UserRole name);
}