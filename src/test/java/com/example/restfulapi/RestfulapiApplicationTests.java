package com.example.restfulapi;

import com.example.restfulapi.bean.Car;
import com.example.restfulapi.repositories.CarRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.assertEquals;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RestfulapiApplicationTests {

	@Autowired
	CarRepository carRepo;

	static final int expectedQty = 3;

	@Test
	public void checkLength() {
		List<Car> carLength = carRepo.findAll();

		assertEquals(expectedQty, carLength.size() + 1);
	}
}