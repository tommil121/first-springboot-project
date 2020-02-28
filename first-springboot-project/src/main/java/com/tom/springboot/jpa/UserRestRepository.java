package com.tom.springboot.jpa;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="users", collectionResourceRel="users")
public interface UserRestRepository extends CrudRepository<User, Long>{
	List<User> findByRole(@Param("role") String role);
}