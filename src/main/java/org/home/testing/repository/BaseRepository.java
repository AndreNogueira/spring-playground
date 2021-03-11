package org.home.testing.repository;

import java.io.Serializable;
import org.home.testing.domain.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseRepository<T extends BaseEntity, I extends Serializable> extends JpaRepository<T, I>, JpaSpecificationExecutor<T> {

}
