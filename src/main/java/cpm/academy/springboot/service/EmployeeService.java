package cpm.academy.springboot.service;

import cpm.academy.springboot.model.entity.Employee;
import java.util.List;

public interface EmployeeService {
  List<Employee> getAll();
}
