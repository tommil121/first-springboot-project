package com.tom.springboot.jpa;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository extends PagingAndSortingRepository<User, Long>{
	List<User> findByRole(String role);
}
