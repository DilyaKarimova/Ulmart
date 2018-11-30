package ru.itpark.domain;

public class Computer extends Product {
    private String manufacturer;
    private String color;

    public Computer(int id, String category, String name, int price, String description, String manufacturer, String color) {
        super(id, category, name, price, description);
        this.manufacturer = manufacturer;
        this.color = color;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
