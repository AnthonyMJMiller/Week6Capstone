package com.Wk6Capstone.Week6Capstone.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Tasks {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@ManyToOne
	private Users user;
	private String description;
	private String duedate;
	private Boolean complete;
	
	
	
	public Tasks() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Tasks(Integer id, Users user, String description, String duedate, Boolean complete) {
		super();
		this.id = id;
		this.user = user;
		this.description = description;
		this.duedate = duedate;
		this.complete = complete;
	}

	public Tasks(Users user, String description, String duedate, Boolean complete) {
		this.user = user;
		this.description = description;
		this.duedate = duedate;
		this.complete = complete;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public Users getUser() {
		return user;
	}



	public void setUser(Users user) {
		this.user = user;
	}

	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public String getDuedate() {
		return duedate;
	}



	public void setDuedate(String duedate) {
		this.duedate = duedate;
	}



	public Boolean getComplete() {
		return complete;
	}



	public void setComplete(Boolean complete) {
		this.complete = complete;
	}



	@Override
	public String toString() {
		return "Tasks [id=" + id + ", user=" + user + ", description=" + description + ", duedate="
				+ duedate + ", complete=" + complete + "]";
	}


}
