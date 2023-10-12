package cpm.academy.springboot.model.entity;

import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee extends ModifierOptions{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  @Column
  private String name;
  @Column(updatable = false, insertable = false)
  private String dob;
  @Column(name = "salary")
  private Integer salary;
//  @ManyToOne
//  @JoinColumn(name = "dept_id")
//  private Department department;
//  @OneToMany
//  @JoinColumn(name = "employee_id")
//  private List<JobEmployee> jobs;
//  @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
//  @JoinColumn(name = "employee_id")
//  private List<Address> addresses;
  @Embedded
  private DocData docData;
}
