/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import data.*;
import domain.*;
import java.sql.*;
import java.time.LocalDate;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bryan Andagoya
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            Connection connection = Connect.getConnection();
            connection.setAutoCommit(false);

            CustomerDAO customer = new CustomerDAO(connection);
            DeliveryDriverDAO deliveryDriver = new DeliveryDriverDAO(connection);
            ProductDAO product = new ProductDAO(connection);
            InvoiceDAO invoice = new InvoiceDAO(connection);
            ManagerDAO manager = new ManagerDAO(connection);
            SupplierDAO supplier = new SupplierDAO(connection);
            RawMaterialDAO rawMaterial = new RawMaterialDAO(connection);

            HashMap<Product, Integer> products;
            double total;

//customer.insert(new Customer("3234567890", "Karen", "Cordoba", "KCor", "1234", "kcor@gmail.com", "3245789", "El Inca"));
//            customer.insert(new Customer("3234567890", "Karen", "Cordoba", "KCor", "123asdf", "kcor@gmail.com", "3245789", "El Inca"));
//            customer.insert(new Customer("3234567890", "Karen", "Cordoba", "KCor", "123asdf", "kcor@gmail.com", "3245789", "El Inca"));
//            customer.insert(new Customer("3234567890", "Karen", "Cordoba", "KCor", "123asdf", "kcor@gmail.com", "3245789", "El Inca"));
//            customer.update(new Customer(1, "0894561230", "Viviana", "Maldonado", "viviM", "123asdf", "vivi@gmail.com", "0145789", "Conocoto"));
//            customer.select().forEach(System.out::println);
//            System.out.println(customer.select(1));
//            customer.delete(new Customer(3));
//            
            //deliveryDriver.insert(new DeliveryDriver("3234567890", "Damian", "Suarez", "dami10", "1234", "dami@gmail.com", "3245789", "La Florida", "pbx123"));
//            deliveryDriver.insert(new DeliveryDriver("3234567890", "Damian", "Suarez", "dami10", "123asdf", "dami@gmail.com", "3245789", "La Florida", "pbx123"));
//            deliveryDriver.insert(new DeliveryDriver("3234567890", "Damian", "Suarez", "dami10", "123asdf", "dami@gmail.com", "3245789", "La Florida", "pbx123"));
//            deliveryDriver.insert(new DeliveryDriver("3234567890", "Damian", "Suarez", "dami10", "123asdf", "dami@gmail.com", "3245789", "La Florida", "pbx123"));
//            deliveryDriver.update(new DeliveryDriver(1, "0123456789", "Karla", "Rodriguez", "karla45", "123asdf", "karla@gmail.com", "1245789", "Las Casas", "pbx321"));
//            deliveryDriver.select().forEach(System.out::println);
            System.out.println(deliveryDriver.select(1));
//            deliveryDriver.delete(new DeliveryDriver(3));
//            
//            product.insert(new Product("hamburguesa grande", null, 5.50, 5.0));
//            product.insert(new Product("hamburguesa grande", null, 5.50, 5.0));
//            product.insert(new Product("hamburguesa grande", null, 5.50, 5.0));
//            product.insert(new Product("hamburguesa grande", null, 5.50, 5.0));
//            product.update(new Product(1, "helado", "Helado de chocolate", 0.75, null));
//            product.select().forEach(System.out::println);
//            System.out.println(product.select(1));
//            product.delete(new Product(3));
//
//            products = new HashMap<>();
//            products.put(product.select(2), 1);
//            products.put(product.select(5), 2);
//
//            total = products.entrySet().stream().mapToDouble(e -> e.getKey().getPrice() * e.getValue()).sum();
//            invoice.insert(new Invoice(LocalDate.now(), total, 2, 2, products));
//
//            products = new HashMap<>();
//            products.put(product.select(2), 1);
//            products.put(product.select(5), 1);
//
//            total = products.entrySet().stream().mapToDouble(e -> e.getKey().getPrice() * e.getValue()).sum();
//            invoice.insert(new Invoice(LocalDate.now(), total, 2, 2, products));
//
//            products = new HashMap<>();
//            products.put(product.select(2), 5);
//            products.put(product.select(5), 2);
//
//            total = products.entrySet().stream().mapToDouble(e -> e.getKey().getPrice() * e.getValue()).sum();
//            invoice.insert(new Invoice(LocalDate.now(), total, 2, 2, products));
//
//            products = new HashMap<>();
//            products.put(product.select(2), 1);
//            products.put(product.select(5), 6);
//
//            total = products.entrySet().stream().mapToDouble(e -> e.getKey().getPrice() * e.getValue()).sum();
//            invoice.insert(new Invoice(LocalDate.now(), total, 2, 2, products));
//
//            products = new HashMap<>();
//            products.put(product.select(2), 4);
//            products.put(product.select(5), 6);
//
//            total = products.entrySet().stream().mapToDouble(e -> e.getKey().getPrice() * e.getValue()).sum();
//            invoice.update(new Invoice(1, LocalDate.now(), total, 2, 2, products));
//
//            invoice.select().forEach(i -> {
//                System.out.println("\n" + i);
//                System.out.println("\nProducts:");
//                i.getProducts().forEach((pro, q) -> System.out.println(pro + "   Quantity: " + q));
//                System.out.println();
//            });
//                System.out.println(invoice.select(2));
//            invoice.delete(new Invoice(1));
//            
//            manager.insert(new Manager("2224567890", "ana", "torres", "ale", "hola", "ale.com", "123456", "la lona", "gestion"));
//            manager.insert(new Manager("2224567890", "ana", "torres", "ale", "hola", "ale.com", "123456", "la lona", "gestion"));
//            manager.insert(new Manager("2224567890", "ana", "torres", "ale", "hola", "ale.com", "123456", "la lona", "gestion"));
//            manager.insert(new Manager("2224567890", "ana", "torres", "ale", "hola", "ale.com", "123456", "la lona", "gestion"));
//            manager.update(new Manager(2, "3334567890", "carlos", "torres", "ale", "hola", "ale.com", "123456", "la lona", "gestion"));
//            manager.select().forEach(System.out::println);
//            System.out.println(manager.select(1));
//            manager.delete(new Manager(3));
//            
//            supplier.insert(new Supplier("pronaca", "1245789", "pro@gmail.com", "Carcelen"));
//            supplier.insert(new Supplier("pronaca", "1245789", "pro@gmail.com", "Carcelen"));
//            supplier.insert(new Supplier("pronaca", "1245789", "pro@gmail.com", "Carcelen"));
//            supplier.insert(new Supplier("pronaca", "1245789", "pro@gmail.com", "Carcelen"));
//            supplier.update(new Supplier(1, "empresa", "2245789", "empresa@gmail.com", "Carcelen"));
//            supplier.select().forEach(System.out::println);
//            System.out.println(supplier.select(1));
//            supplier.delete(new Supplier(1));
//
//            rawMaterial.insert(new RawMaterial("papas", "libras de papas", 45.23, 2, LocalDate.now(), 2L));
//            rawMaterial.insert(new RawMaterial("papas", null, 45.23, 2, LocalDate.now(), null));
//            rawMaterial.insert(new RawMaterial("papas", "libras de papas", 45.23, 2, LocalDate.now(), 2L));
//            rawMaterial.insert(new RawMaterial("papas", "libras de papas", 45.23, 2, LocalDate.now(), null));
//            rawMaterial.update(new RawMaterial(9, "carne", "libras de carne", 45, 8, LocalDate.now(), 2L));
//            rawMaterial.select().forEach(System.out::println);
//            System.out.println(rawMaterial.select(9));
//            rawMaterial.delete(new RawMaterial(10));
            connection.commit();
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
