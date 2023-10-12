package cpm.academy.springboot.controller;


import cpm.academy.springboot.model.entity.Employee;
import cpm.academy.springboot.service.EmployeeService;
import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class CompanyController {
  private final EmployeeService employeeService;

  @GetMapping(value = "/employee")
  public String getAll(Model model) {
    List<Employee> employees = employeeService.getAll();
    model.addAttribute("employees", employees);

    return "employee";
  }
}
