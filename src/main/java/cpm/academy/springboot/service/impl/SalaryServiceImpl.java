package cpm.academy.springboot.service.impl;

import cpm.academy.springboot.service.SalaryService;
import org.springframework.stereotype.Service;

@Service
public class SalaryServiceImpl implements SalaryService {

  @Override
  public Integer getSalary(Integer salary) {
    return salary != null ? salary + 100 : 0;
  }
}
