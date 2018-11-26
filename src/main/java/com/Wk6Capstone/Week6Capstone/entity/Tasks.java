package com.Wk6Capstone.Week6Capstone.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Tasks {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idtasks;
	@ManyToOne
	@JoinColumn (name = "userid")
	private Users user;
	private String description;
	private String duedate;
	private Boolean completestatus;
	
	
	
	public Tasks() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Tasks(Integer id, Users user, String description, String duedate, Boolean complete) {
		super();
		this.idtasks = id;
		this.user = user;
		this.description = description;
		this.duedate = duedate;
		this.completestatus = complete;
	}

	public Tasks(Users user, String description, String duedate, Boolean complete) {
		this.user = user;
		this.description = description;
		this.duedate = duedate;
		this.completestatus = complete;
	}
	
	public Tasks(String description, String duedate, Users user) {
		super();
		this.description = description;
		this.duedate = duedate;
		this.user = user;
	}

	public Tasks(String description, String duedate) {
		super();
		this.description = description;
		this.duedate = duedate;
	
	}

	public Integer getId() {
		return idtasks;
	}



	public void setId(Integer id) {
		this.idtasks = id;
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
		return completestatus;
	}



	public void setComplete(Boolean complete) {
		this.completestatus = complete;
	}



	@Override
	public String toString() {
		return "Tasks [id=" + idtasks + ", user=" + user + ", description=" + description + ", duedate="
				+ duedate + ", complete=" + completestatus + "]";
	}


}
