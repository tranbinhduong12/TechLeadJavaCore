package JavaCollection.Collection.Exercise12;


import java.time.LocalDate;

public class Product {
    private String name;
    private String code;
    private double price;
    private LocalDate manufactureDate; // ngày sản xuất

    public Product(String name, String code, double price, LocalDate manufactureDate) {
        this.name = name;
        this.code = code;
        this.price = price;
        this.manufactureDate = manufactureDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", price=" + price +
                ", manufactureDate=" + manufactureDate +
                '}';
    }
}
