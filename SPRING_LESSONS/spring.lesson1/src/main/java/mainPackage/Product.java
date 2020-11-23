package mainPackage;

import java.util.Objects;

public class Product {

    private Long id;
    private String name;
    private Double price;

    public Product(Long id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,name,price);
    }

    @Override
    public String toString() {
        return "Product {" + "id = " + id + ", name = " + name + ", price = " + price + "}";
    }
}
