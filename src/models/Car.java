package models;

import enums.TYPE;

public class Car {
    private String name;
    private String id;
    private TYPE typeOfCar;
    private Integer modelYear;


    public Car(String name, String id, TYPE typeOfCar, Integer modelYear) {
        this.name = name;
        this.id = id;
        this.typeOfCar = typeOfCar;
        this.modelYear = modelYear;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public TYPE getTypeOfCar() {
        return typeOfCar;
    }

    public Integer getModelYear() {
        return modelYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTypeOfCar(TYPE typeOfCar) {
        this.typeOfCar = typeOfCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", typeOfCar=" + typeOfCar +
                ", modelYear=" + modelYear +
                '}';
    }

    public void setModelYear(Integer modelYear) {
        this.modelYear = modelYear;


    }
}
