package com.Wk6Capstone.Week6Capstone.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Users {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private Integer id;
	private String email;
	private String password;
	private String name;
	@Transient
	Set<Tasks> task;
	
	
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Users(Integer id, String email, String password, String name, Set<Tasks> task) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.name = name;
		this.task = task;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Set<Tasks> getTask() {
		return task;
	}


	public void setTask(Set<Tasks> task) {
		this.task = task;
	}


	@Override
	public String toString() {
		return "Users [id=" + id + ", email=" + email + ", password=" + password + ", name=" + name + ", task=" + task
				+ "]";
	}

}
