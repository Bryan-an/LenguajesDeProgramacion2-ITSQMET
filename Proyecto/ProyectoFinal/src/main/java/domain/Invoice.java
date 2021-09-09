/*
 * Invoice
 */
package domain;

import java.sql.*;
import java.util.HashMap;

/**
 *
 * @author Bryan Andagoya
 */
public class Invoice {

    private int id;
    private Date date;
    private double total;
    private Integer customerId;
    private Integer deliveryDriverId;

    private HashMap<Product, Integer> products;

    //DELETE 
    public Invoice(int id) {
        this.id = id;
    }

    //INSERT 
    public Invoice(Date date, double total, Integer customerId,
            Integer deliveryDriverId, HashMap<Product, Integer> products) {

        this.date = date;
        this.total = total;
        this.customerId = customerId;
        this.deliveryDriverId = deliveryDriverId;
        this.products = products;
    }

    //UPDATE - SELECT 
    public Invoice(int id, Date date, double total, Integer customerId,
            Integer deliveryDriverId, HashMap<Product, Integer> products) {

        this.id = id;
        this.date = date;
        this.total = total;
        this.customerId = customerId;
        this.deliveryDriverId = deliveryDriverId;
        this.products = products;
    }

    //getters - setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public Integer getDeliveryDriverId() {
        return deliveryDriverId;
    }

    public void setDeliveryDriverId(Integer deliveryDriverId) {
        this.deliveryDriverId = deliveryDriverId;
    }

    public HashMap<Product, Integer> getProducts() {
        return products;
    }

    public void setProducts(HashMap<Product, Integer> products) {
        this.products = products;
    }

    //toString
    @Override
    public String toString() {
        return "Invoice{" + "id=" + id + ", date=" + date + ", total=" + total + ", customerId=" + customerId + ", deliveryDriverId=" + deliveryDriverId + '}';
    }

}
