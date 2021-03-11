package org.home.testing.service;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import org.home.testing.domain.BaseEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.transaction.annotation.Transactional;

public interface BaseService<T extends BaseEntity, ID extends Serializable> {

  T save(T entity);

  List<T> saveAll(Collection<T> entities);

  List<T> findAll();

  @Transactional(readOnly = true)
  Page<T> findAll(Pageable pageable);

  Optional<T> findById(ID entityId);

  void delete(T entity);

  void deleteById(ID entityId);

  @Transactional(readOnly = true)
  long count();

  @Transactional(readOnly = true)
  long countBySpecification(Specification<T> specification);

  @Transactional(readOnly = true)
  List<T> findAllBySpecification(Specification<T> specification);

  @Transactional(readOnly = true)
  Page<T> findAllBySpecification(Specification<T> specification, Pageable pageable);
}
