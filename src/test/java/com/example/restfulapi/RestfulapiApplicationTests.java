package com.example.restfulapi;

import com.example.restfulapi.bean.Car;
import com.example.restfulapi.repositories.CarRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import org.junit.runners.MethodSorters;
import org.junit.FixMethodOrder;

import java.util.List;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(SpringRunner.class)
@SpringBootTest
public class RestfulapiApplicationTests {

	@Autowired
	CarRepository carRepo;

	static final int expectedQty = 3;

	@Test
	public void checkCarRepositoryLength() {
		List<Car> carLength = carRepo.findAll();

		assertEquals(expectedQty, carLength.size() + 1);
	}

    @Test
    public void checkCarId() {
	    String carId = "5aa323f93f4a64131c058b241";
        Car car = carRepo.findOne(carId);

        assertNotNull("Car object is null. The id wasn't found.", car);
    }

    @Test
    public void checkCarCreation() {
	    Car newCar = new Car("12", "MyBrand", "MyModel");

	    Car createdCar = carRepo.save(newCar);

	    assertFalse("The new object couldn't be created or Updated", newCar.getBrand() == createdCar.getBrand() && newCar.getModel() == createdCar.getModel());
    }

    @Test
    public void checkCarDeletion() {
	    String carId = "12";

	    carRepo.deleteById(carId);

        Car car = carRepo.findOne(carId);

        assertNotNull("Car was deleted. The id wasn't found.", car);
    }
}