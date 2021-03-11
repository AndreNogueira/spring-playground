package org.home.testing.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@Builder
@Entity
@Table(name = "eventRecording")
@EqualsAndHashCode(callSuper = true)
public class EventRecording extends BaseEntity {

}
