package ru.itpark.domain;

public class TShirt extends Product {
    private int size;
    private String gender;

    public TShirt(int id, String category, String name, int price, String description, int size, String gender) {
        super(id, category, name, price, description);
        this.size = size;
        this.gender = gender;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
