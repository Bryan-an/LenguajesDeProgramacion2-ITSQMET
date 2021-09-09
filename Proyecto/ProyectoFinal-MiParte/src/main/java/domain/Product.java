/*
 * Product
 */
package domain;

/**
 *
 * @author Bryan Andagoya
 */
public class Product {

    private int id;
    private String name;
    private String description;
    private double price;
    private Double discount;

    //DELETE
    public Product(int id) {
        this.id = id;
    }

    //INSERT 
    public Product(String name, String description, double price, Double discount) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.discount = discount;
    }

    //UPDATE - SELECT 
    public Product(int id, String name, String description, double price, Double discount) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.discount = discount;
    }

    //getters - setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    //toString
    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + ", discount=" + discount + '}';
    }

}
