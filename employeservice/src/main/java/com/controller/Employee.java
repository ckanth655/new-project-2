package com.controller;

import lombok.Data;

@Data
public class Employee {
	private String name;
	private int id;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name) {
		super();
		this.name = name;
		this.id = id;
	}

}
