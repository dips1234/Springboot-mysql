package com.springboot.mysql.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.mysql.entity.Employee;
import com.springboot.mysql.repository.EmployeeRepo;

@Service
@Transactional
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	public Employee createEmployee(Employee emp) {
		if(employeeRepo.findById(emp.getId()).isPresent()) {
			//update operation
			employeeRepo.updateEmployee(emp.getName(), emp.getDept(), emp.getSalary(), emp.getId());
			return emp;
		}
		else
		return employeeRepo.save(emp);
	}
	public List<Employee> getAllEMployees(){
		return employeeRepo.findAll();
	}
	public Employee getEmployeeById(Long id) {
		return employeeRepo.findById(id).orElse(new Employee());
	}
	public void deleteById(Long id) {
		employeeRepo.deleteById(id);
	}
	

}
