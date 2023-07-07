package com.camp.myapp.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Data

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Person {
	private String name;
	private String gender;
	private String[] hobby;
}
