package cpm.academy.springboot.model.entity;

import java.time.Instant;
import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@Data
@MappedSuperclass
public class ModifierOptions {
  @Column(name = "created_by")
  private String createdBy;
  private Instant created;
  @Column(name = "modified_by")
  private String modifiedBy;
  private Instant modified;
}
