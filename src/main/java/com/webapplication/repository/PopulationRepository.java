package com.webapplication.repository;

import org.springframework.data.repository.CrudRepository;
import com.webapplication.model.Population;

public interface PopulationRepository extends CrudRepository<Population,String> {
	
}
