package cpm.academy.springboot.model.entity;

import java.io.Serializable;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class CustomerPK implements Serializable {
  private String email;
  private String brand;
}
