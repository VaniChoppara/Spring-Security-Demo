package com.demo.security.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;

@RestController
public class TodoController {

	private Logger logger=LoggerFactory.getLogger(getClass());
	private static final List<Todo> TODO_LIST = List.of(new Todo("AWS", "Sandya"), new Todo("Spring", "Ravi"));

	@GetMapping("/todos")
	public List<Todo> showTodos() {
		return TODO_LIST;
	}

	@GetMapping("/user/{name}/todos")
	public Todo showSpecipicUserTodos(@PathParam(value = "name") String name) {
		return TODO_LIST.get(0);
	}

	@PostMapping("/user/{name}/todos")
	public void  addSpecipicUserTodos(@PathParam(value = "name") String name, @RequestBody Todo todo) {
		logger.info("create { } for { }",todo, name);
	}

	record Todo(String name, String author) {
	};
}
