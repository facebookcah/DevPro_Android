package models;

public class Food {
    private int image;
    private String title;
    private String rate;
    private String name;
    private String deliveryTime;
    private String minPrice;

    public Food(int image, String title, String rate, String name, String deliveryTime, String minPrice) {
        this.image = image;
        this.title = title;
        this.rate = rate;
        this.name = name;
        this.deliveryTime = deliveryTime;
        this.minPrice = minPrice;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public String getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(String minPrice) {
        this.minPrice = minPrice;
    }
}
