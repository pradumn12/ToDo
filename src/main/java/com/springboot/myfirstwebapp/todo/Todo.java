package com.springboot.myfirstwebapp.todo;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

@Entity
public class Todo {
	
	public Todo() {
		
	}

	public Todo(int id, String userName, String description, LocalDate finalDate, boolean completition) {
		super();
		this.id = id;
		this.username = username;
		this.description = description;
		this.finalDate = finalDate;
		this.completition = completition;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String username;
	private String description;

	private LocalDate finalDate;
	private boolean completition;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return username;
	}

	public void setUserName(String userName) {
		this.username = userName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getFinalDate() {
		return finalDate;
	}

	public void setFinalDate(LocalDate finalDate) {
		this.finalDate = finalDate;
	}

	public boolean isCompletition() {
		return completition;
	}

	public void setCompletition(boolean completition) {
		this.completition = completition;
	}

	@Override
	public String toString() {
		return "ToDo [id=" + id + ", userName=" + username + ", description=" + description + ", finalDate=" + finalDate
				+ ", completition=" + completition + "]";
	}

}
