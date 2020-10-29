package com.example.demo.model;

import lombok.Builder;
import lombok.Data;

@Data
//The annotation below is for enabling builder design pattern
@Builder
public class MyIntroduction {
	
	private String name;
	private int age;
	private String skills;
}
