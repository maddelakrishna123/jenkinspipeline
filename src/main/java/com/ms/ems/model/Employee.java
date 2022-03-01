package com.ms.ems.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="employee")
public class Employee {
	@Id
	private int id;
	@Column
	private String name;
	@Column
	private String gender;
	@Column
	private int age;
	@Column
	private double salary;
	

}
