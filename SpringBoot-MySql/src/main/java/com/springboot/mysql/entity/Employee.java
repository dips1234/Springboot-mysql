package com.springboot.mysql.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "EMPLOYEE")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

	@Id
	@GeneratedValue
	@Column(name="ID")
	public Long id;
	@Column(name = "NAME")
	public String name;
	@Column(name = "DEPT")
	public String dept;
	@Column(name = "SALARY")
	public Double salary;

}
