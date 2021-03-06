package com.example.restfulapi.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

// TODO: Understand Bean Concepts

@Document(collection = "cars")
public class Car {
    @Id
    private String id;
    private String brand;
    private String model;

    public Car(){}

    public Car(String id, String brand, String model) {
        super();
        this.id = id;
        this.brand = brand;
        this.model = model;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Id:- " + getId() + ", Brand:- " + getBrand() + ", Model:- " + getModel());
        return str.toString();
    }
}
