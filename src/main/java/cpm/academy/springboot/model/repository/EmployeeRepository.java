package cpm.academy.springboot.model.repository;

import cpm.academy.springboot.model.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
