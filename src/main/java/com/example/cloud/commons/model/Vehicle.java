package org.example.cloud.commons.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Vehicle {
    @Id
    @GeneratedValue
    private Long id;
    private String make;
    private String model;
    private String type;
    private int year;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Vehicle(Long id, String make, String model, String type, int year) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.type = type;
        this.year = year;
    }

    public Vehicle() {
    }
}
