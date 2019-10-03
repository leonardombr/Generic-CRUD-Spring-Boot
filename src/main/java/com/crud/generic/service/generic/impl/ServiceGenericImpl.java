package com.crud.generic.service.generic.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.crud.generic.entity.baseEntity.BaseEntity;
import com.crud.generic.repository.generic.GenericRepository;
import com.crud.generic.service.generic.ServiceGeneric;

public class ServiceGenericImpl<T extends BaseEntity> implements ServiceGeneric<T> {
	
	@Autowired
	protected GenericRepository<T> genericRepository;
	
	@Override
	public List<T> findAll() throws Exception {
		try {
			return genericRepository.findAll(); 
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public T save(T entity) throws Exception {
		try {
			return genericRepository.save(entity);
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public void delete(Long id) throws Exception {
		try {
			genericRepository.deleteById(id);
		} catch (Exception e) {
			throw e;
		}
	}

}
