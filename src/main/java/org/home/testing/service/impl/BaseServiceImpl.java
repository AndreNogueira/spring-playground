package org.home.testing.service.impl;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.home.testing.domain.BaseEntity;
import org.home.testing.repository.BaseRepository;
import org.home.testing.service.BaseService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@RequiredArgsConstructor
public abstract class BaseServiceImpl<T extends BaseEntity, ID extends Serializable> implements BaseService<T, ID> {

  private final BaseRepository<T, ID> baseRepository;


  @Override
  @Transactional
  public T save(T entity) {
    return baseRepository.save(entity);
  }

  @Override
  @Transactional
  public List<T> saveAll(Collection<T> entities) {
    return baseRepository.saveAll(entities);
  }

  @Override
  @Transactional(readOnly = true)
  public List<T> findAll() {
    return baseRepository.findAll();
  }

  @Override
  @Transactional(readOnly = true)
  public Page<T> findAll(Pageable pageable) {
    return baseRepository.findAll(pageable);
  }

  @Override
  @Transactional(readOnly = true)
  public Optional<T> findById(ID entityId) {
    return baseRepository.findById(entityId);
  }

  @Override
  @Transactional
  public void delete(T entity) {
    baseRepository.delete(entity);
  }

  @Override
  @Transactional
  public void deleteById(ID entityId) {
    baseRepository.deleteById(entityId);
  }

  @Override
  @Transactional(readOnly = true)
  public long count() {
    return baseRepository.count();
  }

  @Override
  @Transactional(readOnly = true)
  public long countBySpecification(Specification<T> specification) {
    return baseRepository.count(specification);
  }

  @Override
  @Transactional(readOnly = true)
  public List<T> findAllBySpecification(Specification<T> specification) {
    return baseRepository.findAll(specification);
  }

  @Override
  @Transactional(readOnly = true)
  public Page<T> findAllBySpecification(Specification<T> specification, Pageable pageable) {
    return baseRepository.findAll(specification, pageable);
  }
}
