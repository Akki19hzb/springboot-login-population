package com.webapplication.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapplication.model.Population;
import com.webapplication.repository.PopulationRepository;

@Service
public class PopulationService implements PopulationServiceInterface{

	@Autowired
	private PopulationRepository populationRepository;
	
	@Override
	public List<Population> getAllPopulation()
	{
		List<Population> population=new ArrayList<>();
		populationRepository.findAll()
		.forEach(population::add);
		return population;
	}
	
}
