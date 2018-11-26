package com.Wk6Capstone.Week6Capstone.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Users {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer userid;
	
	private String email;
	private String password;
	private String name;
	@OneToMany(mappedBy="user")
	List<Tasks> task = new ArrayList<>();
	
	
	public Users() {
		
		// TODO Auto-generated constructor stub
	}


	public Users(Integer id, String email, String password, String name, List<Tasks> task) {
		
		this.userid = id;
		this.email = email;
		this.password = password;
		this.name = name;
		this.task = task;
	}
	
	public Users(Integer id, String email, String password, String name) {
		
		this.email = email;
		this.password = password;
		this.name = name;
	}
	
	public Users(String name,String email, String password) {
		
		this.name=name;
		this.email = email;
		this.password = password;
	}
	public Users(String email, String password) {
		
		this.email = email;
		this.password = password;
	}


	public Integer getId() {
		return userid;
	}


	public void setId(Integer id) {
		this.userid = id;
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


	public List<Tasks> getTask() {
		return task;
	}


	public void setTask(List<Tasks> task) {
		this.task = task;
	}


	@Override
	public String toString() {
		return "Users [id=" + userid + ", email=" + email + ", password=" + password + ", name=" + name + ", task=" + task
				+ "]";
	}

}
