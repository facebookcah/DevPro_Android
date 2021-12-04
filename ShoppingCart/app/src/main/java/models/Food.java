package models;

import java.io.Serializable;

public class Food implements Serializable {
    private int image;
    private String name;
    private String address;
    private int price;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Food(int image, String name, String address, int price) {
        this.image = image;
        this.name = name;
        this.address = address;
        this.price = price;
    }
}
