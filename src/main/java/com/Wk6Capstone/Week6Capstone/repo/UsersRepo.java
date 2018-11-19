package com.Wk6Capstone.Week6Capstone.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Wk6Capstone.Week6Capstone.entity.Users;

public interface UsersRepo extends JpaRepository<Users, Integer>{
	
	List<Users> findAllByOrderByName();

	Users findByEmail(String email);

}
