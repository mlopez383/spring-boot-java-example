package com.lopezmiguelangel.springboot.basics.example;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpertoJpaRepository extends JpaRepository  <Experto, String>{

}