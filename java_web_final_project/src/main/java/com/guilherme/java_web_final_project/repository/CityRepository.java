package com.guilherme.java_web_final_project.repository;

import com.guilherme.java_web_final_project.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City,Integer> {
}
