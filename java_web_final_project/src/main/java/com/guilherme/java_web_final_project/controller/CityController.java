package com.guilherme.java_web_final_project.controller;

import com.guilherme.java_web_final_project.model.City;
import com.guilherme.java_web_final_project.service.CityService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class CityController {
    private CityService cityService;

    public CityController(CityService cityService) {
        this.cityService = cityService;
    }
    @GetMapping
    public List<City> allCities(){
        return cityService.getCities();
    }
    @PostMapping
    public void saveCity(@RequestBody City city){
        this.cityService.addCity(city);
    }
    @DeleteMapping("/{id}")
    public void deleteCity(@PathVariable Integer id){
        this.cityService.deleteCity(id);
    }

    @PutMapping
    public void update(@RequestBody City city){
        this.cityService.update(city);
    }
}
