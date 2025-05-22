package worksheet2;

public class Car implements Node {
    private String brand;
    private String model;
    private double price;
    private int year;

    public Car(String brand, String model, double price, int year) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.year = year;
    }

    @Override
    public int getKey() {
        return this.year;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Model: " + model + ", Price: $" + price + ", Year: " + year;
    }
}
