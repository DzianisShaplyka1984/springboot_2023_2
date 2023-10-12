package cpm.academy.springboot.model.repository;

import cpm.academy.springboot.model.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
