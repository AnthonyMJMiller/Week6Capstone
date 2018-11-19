package com.Wk6Capstone.Week6Capstone.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Wk6Capstone.Week6Capstone.entity.Tasks;
import com.Wk6Capstone.Week6Capstone.entity.Users;

public interface TasksRepo extends JpaRepository<Tasks, Integer>{
	
	List<Tasks> findAllByOrderByName();

	List<Tasks> findAllByUser(Users user);

}
