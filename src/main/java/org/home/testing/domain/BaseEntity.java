package org.home.testing.domain;

import java.io.Serializable;
import java.util.UUID;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@MappedSuperclass
public abstract class BaseEntity extends Auditable<String> implements Serializable {

  @Id
  @GeneratedValue
  private UUID id;
  @Version
  private Long version;

}