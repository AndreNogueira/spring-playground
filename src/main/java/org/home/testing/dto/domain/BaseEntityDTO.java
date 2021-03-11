package org.home.testing.dto.domain;

import java.io.Serializable;
import java.time.Instant;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class BaseEntityDTO implements Serializable {

  private UUID id;
  private Instant createDate;
  private Instant updateDate;
  private Long version;

}
