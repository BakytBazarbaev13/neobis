public class Car {
    private long id;
    private double volume;
    private String color;
    private String brand;

    public void setId(long id) {
        this.id = id;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public long getId() {
        return id;
    }

    public double getVolume() {
        return volume;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }
}
