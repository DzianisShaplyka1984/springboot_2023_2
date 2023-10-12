package cpm.academy.springboot.service.impl;

import cpm.academy.springboot.model.entity.Employee;
import cpm.academy.springboot.model.repository.EmployeeRepository;
import cpm.academy.springboot.service.EmployeeService;
import cpm.academy.springboot.service.SalaryService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
  private final EmployeeRepository employeeRepository;
  private final SalaryService salaryService;

  @Override
  public List<Employee> getAll() {
    List<Employee> employees = employeeRepository.findAll();

    employees.forEach(employee -> employee.setSalary(salaryService.getSalary(employee.getSalary())));

    return employees;
  }
}
