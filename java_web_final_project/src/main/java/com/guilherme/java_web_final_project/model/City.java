package com.guilherme.java_web_final_project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String name;
    private String country;
    private double population;

    public City() {
    }

    public City(String name, String country, double population) {
        this.name = name;
        this.country = country;
        this.population = population;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City city)) return false;
        return getPopulation() == city.getPopulation() && Objects.equals(getId(), city.getId()) && Objects.equals(getName(), city.getName()) && Objects.equals(getCountry(), city.getCountry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getCountry(), getPopulation());
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", population=" + population +
                '}';
    }
}
