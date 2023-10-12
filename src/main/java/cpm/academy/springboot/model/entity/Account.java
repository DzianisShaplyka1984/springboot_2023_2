package cpm.academy.springboot.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Account extends ModifierOptions {
  private Integer id;
  private Employee employee;
  private Integer salary;
}
