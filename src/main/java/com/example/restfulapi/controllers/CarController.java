package com.example.restfulapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.context.support.AbstractApplicationContext;
import com.example.restfulapi.bean.Car;
import com.example.restfulapi.services.CarService;
import java.util.List;

@RestController
public class CarController {

    @Autowired
    AbstractApplicationContext context;

    @GetMapping("/car/{id}")
    public Car Get(@PathVariable String id) {

        CarService carService = (CarService)context.getBean ("carService");
        return carService.find(id);
    }

    //this is a comment
    @GetMapping("/car/findbybrand/{brand}")
    public List<Car> FindByBrand(@PathVariable String brand) {
        CarService carService = (CarService)context.getBean ("carService");
        return carService.findByBrand(brand);
    }

    @GetMapping("/car")
    public List<Car> Get() {

        CarService carService = (CarService)context.getBean ("carService");
        return carService.findAll();
    }

    @PostMapping("/car")
    public List<Car> Post(@RequestBody List<Car> cars) {

        CarService carService = (CarService)context.getBean ("carService");
        carService.create(cars);
        return cars;
    }

    @PutMapping("/car")
    public List<Car> Put(@RequestBody List<Car> cars) {

        CarService carService = (CarService)context.getBean ("carService");
        carService.update(cars);
        return cars;
    }

    @DeleteMapping("/car")
    public List<Car> Delete(@RequestBody List<Car> cars) {

        CarService carService = (CarService)context.getBean ("carService");
        carService.delete(cars);
        return cars;
    }

}
