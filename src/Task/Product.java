package Task;

import Qwerty.Person;

import java.time.LocalDate;

public class Product {
    private int id;
    private String name;
    private String description;
    private double price;
    private LocalDate expireDate;

    public Product(int id, String name, String description, double price, LocalDate expireDate) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.expireDate = expireDate;
    }

    public static ProductBuilder builder() {
        return new ProductBuilder();
    }

    static class ProductBuilder{
        private int id;
        private String name;
        private String description;
        private double price;
        private LocalDate expireDate;

        public ProductBuilder(Product product) {
        }

        public ProductBuilder() {

        }

        public ProductBuilder id(int id) {
            this.id = id;
            return this;
        }

        public ProductBuilder name(String name) {
            this.name = name;
            return this;
        }

        public ProductBuilder description(String description) {
            this.description = description;
            return this;
        }

        public ProductBuilder price(double price) {
            this.price = price;
            return this;
        }

        public ProductBuilder expireDate(LocalDate expireDate) {
            this.expireDate = expireDate;
            return this;
        }
        public Product build() {
            return new Product(
                    this.id,
                    this.name,
                    this.description,
                    this.price,
                    this.expireDate
            );
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getExpireDate() {
        return expireDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", expireDate=" + expireDate +
                '}';
    }
}
