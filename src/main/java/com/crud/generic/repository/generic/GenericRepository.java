package com.crud.generic.repository.generic;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.generic.entity.baseEntity.BaseEntity;

public interface GenericRepository<T extends BaseEntity> extends JpaRepository<T, Long> {

}
