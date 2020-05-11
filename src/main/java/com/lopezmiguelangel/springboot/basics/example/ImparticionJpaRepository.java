package com.lopezmiguelangel.springboot.basics.example;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public interface ImparticionJpaRepository extends JpaRepository  <Imparticion, Integer>{
	@EntityGraph(attributePaths = "experto")
	List<Imparticion> findAll();
}
