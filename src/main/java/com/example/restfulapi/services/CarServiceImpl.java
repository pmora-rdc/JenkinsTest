package com.example.restfulapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restfulapi.bean.Car;
import com.example.restfulapi.repositories.CarRepository;

@Service("carService")
public class CarServiceImpl implements CarService {

    @Autowired
    CarRepository carRepo;

    @Override
    public void create(List<Car> cars) {
        Iterable<Car> c = carRepo.insert(cars);
    }

    @Override
    public void update(List<Car> cars) {
        Iterable<Car> c = carRepo.saveAll(cars);
    }

    @Override
    public void delete(List<Car> cars) {
        carRepo.deleteAll(cars);
    }

    @Override
    public List<Car> findAll() {
        return carRepo.findAll();
    }

    @Override
    public List<Car> findByBrand(String brand) {
        return carRepo.findByBrand(brand);
    }

    @Override
    public Car findByModel(String model) {
        return carRepo.findByModel(model);
    }

    @Override
    public Car find(String id) {
        return carRepo.findOne(id);
    }

    @Override
    public void deleteAll() {
        carRepo.deleteAll();
    }
}