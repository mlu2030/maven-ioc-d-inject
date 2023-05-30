package io.mlu.mde.auto;

import org.springframework.beans.factory.annotation.Autowired;

//@Component
public class Car {
    String type;
    String model;
    double price;
    int combinedFuelEconomy;
    Engine engine;

    public Car() {
        System.out.println("Inside the default constructor of Car.");
    }

    public Car(String type, String model, double price, int combinedFuelEconomy, Engine engine) {
        this.type = type;
        this.model = model;
        this.price = price;
        this.combinedFuelEconomy = combinedFuelEconomy;
        this.engine = engine;

        System.out.println("Inside the parameterized constructor of Car.");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCombinedFuelEconomy() {
        return combinedFuelEconomy;
    }

    public void setCombinedFuelEconomy(int combinedFuelEconomy) {
        this.combinedFuelEconomy = combinedFuelEconomy;
    }

    public Engine getEngine() {
        return engine;
    }
    @Autowired
    public void setEngine(Engine engine) {
        this.engine = engine;
        System.out.println("Inside the setter of property \"engine\".");

    }

    @Override
    public String toString() {
        return "CarBodyType = " + type +
                ", Model = " + model +
                ",\nPrice = " + price +
                ",\nCombinedFuelEconomy = " + combinedFuelEconomy + "mpg" +
                ",\n" + engine;
    }
}
