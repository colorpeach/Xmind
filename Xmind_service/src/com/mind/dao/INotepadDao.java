package com.mind.dao;

import java.util.List;

import org.springframework.data.repository.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.mind.entity.Notepad;

public interface INotepadDao extends Repository<Notepad, Integer> {
	@Transactional(propagation = Propagation.SUPPORTS)
	List<Notepad> findAll();

	@Transactional(propagation = Propagation.SUPPORTS)
	List<Notepad> findByUserId(Integer userId);

	@Transactional(propagation = Propagation.SUPPORTS)
	Notepad save(Notepad notepad);

	@Transactional(propagation = Propagation.SUPPORTS)
	void delete(Integer id);
}
