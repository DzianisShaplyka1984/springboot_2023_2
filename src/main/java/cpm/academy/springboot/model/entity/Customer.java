package cpm.academy.springboot.model.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Customer {
  @EmbeddedId
  private CustomerPK id;
  private String name;
}
