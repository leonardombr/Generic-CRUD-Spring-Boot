package com.crud.generic.controller.generic;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.crud.generic.entity.baseEntity.BaseEntity;

public interface ControllerGeneric<T extends BaseEntity> {
	
	ResponseEntity<Object> save(@RequestBody T entity);
	
	ResponseEntity<T> findAll();
	
	ResponseEntity<String> delete(@PathVariable Long id);

}
