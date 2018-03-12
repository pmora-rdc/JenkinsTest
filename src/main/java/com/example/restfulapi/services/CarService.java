package com.example.restfulapi.services;

import java.util.List;
import com.example.restfulapi.bean.Car;

public interface CarService {

    public void create(List<Car> cars);

    public void update(List<Car> cars);

    public void delete(List<Car> cars);

    public void deleteAll();

    public Car find(String id);

    public List<Car> findByBrand(String brand);

    public Car findByModel(String model);

    public List<Car> findAll();
}