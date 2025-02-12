package com.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

@Service
public class ToDoService {
	
	private static List<Todo> todos = new ArrayList<>();
	private static int todoCount = 0;
	static {
		todos.add(new Todo(++todoCount,"psahani","SpringBoot 1",LocalDate.now().plusYears(1),false));
		todos.add(new Todo(++todoCount,"psahani","Java 1",LocalDate.now().plusYears(2),false));
		todos.add(new Todo(++todoCount,"psahani","AWS 1",LocalDate.now().plusYears(3),true));
		todos.add(new Todo(++todoCount,"psahani","JS 1",LocalDate.now().plusYears(4),false));
		todos.add(new Todo(++todoCount,"psahani","Docker 1",LocalDate.now().plusYears(5),true));
		}
	
	public List<Todo> findByUsername(String username) {
		

		Predicate<? super Todo> predicate = todo -> todo.getUserName().equalsIgnoreCase(username);
		return todos.stream().filter(predicate).toList();
	}
	
	public int findId(String description) {
		int value = -1;
		for(Todo todo: todos) {
			if(todo.getDescription().equalsIgnoreCase(description)) {
				value = todo.getId();
			}
		}
	    return value;
	}
	
	public void addToDo(String username,String description, LocalDate targetdate, boolean done){
		Todo todo = new Todo(++todoCount,username,description,targetdate,done);
		todos.add(todo);
	}
	
	public void deleteById(int id) {
		
		Predicate<? super Todo> predicate = todo -> todo.getId() == id;
		todos.removeIf(predicate);
		
	}

	public Todo findById(int id) {

		
		Predicate<? super Todo> predicate = todo -> todo.getId() == id;
		Todo todo = todos.stream().filter(predicate).findFirst().get();
		return todo;
		
	}

	public void updateToDo(Todo todo) {
		deleteById(todo.getId());
		todos.add(todo);
		
	}


}
