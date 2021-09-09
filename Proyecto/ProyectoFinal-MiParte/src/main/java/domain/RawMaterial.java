/*
 * Row material
 */
package domain;

import java.time.LocalDate;

/**
 *
 * @author Bryan Andagoya
 */
public class RawMaterial {

    private int id;
    private String name;
    private String description;
    private double price;
    private int quantity;
    private LocalDate bestBy;
    private Long supplierId;

    //DELETE
    public RawMaterial(int id) {
        this.id = id;
    }

    //INSERT 
    public RawMaterial(String name, String description, double price,
            int quantity, LocalDate bestBy, Long supplierId) {

        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.bestBy = bestBy;
        this.supplierId = supplierId;
    }

    //UPDATE - SELECT
    public RawMaterial(int id, String name, String description, double price,
            int quantity, LocalDate bestBy, Long supplierId) {

        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.bestBy = bestBy;
        this.supplierId = supplierId;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDate getBestBy() {
        return bestBy;
    }

    public void setBestBy(LocalDate bestBy) {
        this.bestBy = bestBy;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    //toString
    @Override
    public String toString() {
        return "RawMaterial{" + "id=" + id + ", name=" + name + ", description="
                + description + ", price=" + price + ", quantity=" + quantity
                + ", bestBy=" + bestBy + ", supplierId=" + supplierId + '}';
    }

}
