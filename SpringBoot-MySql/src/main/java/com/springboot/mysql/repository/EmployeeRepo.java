package com.springboot.mysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.springboot.mysql.entity.Employee;


@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {
	@Modifying
	@Query(value = "update EMPLOYEE set NAME=:name,DEPT=:dept,SALARY=:salary where ID=:id",nativeQuery = true)
	void updateEmployee(@Param("name")String name,@Param("dept")String dept,@Param("salary")Double salary,@Param("id")Long id);

}
