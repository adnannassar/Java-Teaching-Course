package Klausur_02_2022.Aufgabe_2;

public class Car {
    private String carmaker;
    private String model;
    private String color;
    private double price;

    public Car(String carmaker, String model, String color, double price) {
        this.carmaker = carmaker;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public String getCarmaker() {
        return carmaker;
    }

    public void setCarmaker(String carmaker) {
        this.carmaker = carmaker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
