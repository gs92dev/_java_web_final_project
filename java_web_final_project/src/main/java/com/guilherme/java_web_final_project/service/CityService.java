package com.guilherme.java_web_final_project.service;

import com.guilherme.java_web_final_project.model.City;
import com.guilherme.java_web_final_project.repository.CityRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CityService {
    private final CityRepository cityRepository;

    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }
    public List <City> getCities(){
        return cityRepository.findAll();
    }
    public Optional<City> getCityById(Integer cityId){
        return cityRepository.findById(cityId);
    }
    public void addCity(City city){
        cityRepository.save(city);
    }
    public void deleteCity(Integer cityId){
        cityRepository.deleteById(cityId);
    }
    public void update(City city){
        Integer id = city.getId();
        City foundCity = cityRepository.getReferenceById(id);
        foundCity.setName(city.getName());
        foundCity.setCountry(city.getCountry());
        foundCity.setPopulation(city.getPopulation());
        cityRepository.save(foundCity);
    }
}
