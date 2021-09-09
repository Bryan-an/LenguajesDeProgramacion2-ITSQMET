/*
 * Product DAO
 */
package data;

import domain.Product;
import java.sql.*;
import java.util.*;

/**
 *
 * @author Bryan Andagoya
 */
public class ProductDAO {

    //SQL Statements
    private static final String SQL_SELECT = "SELECT * FROM products";
    
    private static final String SQL_INSERT
            = "INSERT INTO products (name, description, price, discount) VALUES (?,?,?,?)";
    
    private static final String SQL_UPDATE
            = "UPDATE products SET name=?, description=?, price=?, discount=? WHERE id=?";
    
    private static final String SQL_DELETE = "DELETE FROM products WHERE id=?";

    //Connections
    private Connection transactionalConnection = null;
    private static Connection connection = null;
    private static PreparedStatement statement = null;
    private static ResultSet results = null;

    //Constructor
    public ProductDAO(Connection transactionalConnection) {
        this.transactionalConnection = transactionalConnection;
    }

    //Methods
    //SELECT
    public List<Product> select() throws SQLException {
        List<Product> products = new ArrayList<Product>();
        
        try {
            if (transactionalConnection != null) {
                connection = transactionalConnection;
            } else {
                connection = Connect.getConnection();
            }
            
            statement = connection.prepareStatement(SQL_SELECT);
            results = statement.executeQuery();
            
            while (results.next()) {
                int id = results.getInt(1);
                String name = results.getString(2);
                String description = results.getString(3);
                double price = results.getDouble(4);
                Double discount = (Double) results.getObject(5);
                
                Product product = new Product(id, name, description, price, discount);
                
                products.add(product);
            }
        } finally {
            try {
                results.close();
                statement.close();
                
                if (transactionalConnection == null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        
        return products;
    }
    
    public Product select(int productId) throws SQLException {
        Product product = null;
        
        try {
            if (transactionalConnection != null) {
                connection = transactionalConnection;
            } else {
                connection = Connect.getConnection();
            }
            
            statement = connection.prepareStatement("SELECT * FROM products WHERE id=?");
            statement.setInt(1, productId);
            
            results = statement.executeQuery();
            
            if (results.next()) {
                int id = results.getInt(1);
                String name = results.getString(2);
                String description = results.getString(3);
                double price = results.getDouble(4);
                double discount = results.getDouble(5);
                
                product = new Product(id, name, description, price, discount);
            }
        } finally {
            try {
                results.close();
                statement.close();
                
                if (transactionalConnection == null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        
        return product;
    }

    //INSERT
    public int insert(Product product) throws SQLException {
        int records = 0;
        
        try {
            if (transactionalConnection != null) {
                connection = transactionalConnection;
            } else {
                connection = Connect.getConnection();
            }
            
            statement = connection.prepareStatement(SQL_INSERT);
            
            statement.setString(1, product.getName());
            statement.setString(2, product.getDescription());
            statement.setDouble(3, product.getPrice());
            statement.setObject(4, product.getDiscount());
            
            records = statement.executeUpdate();
        } finally {
            try {
                statement.close();
                
                if (transactionalConnection == null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        
        return records;
    }

    //UPDATE
    public int update(Product product) throws SQLException {
        int records = 0;
        
        try {
            if (transactionalConnection != null) {
                connection = transactionalConnection;
            } else {
                connection = Connect.getConnection();
            }
            
            statement = connection.prepareStatement(SQL_UPDATE);
            
            statement.setString(1, product.getName());
            statement.setString(2, product.getDescription());
            statement.setDouble(3, product.getPrice());
            statement.setObject(4, product.getDiscount());
            statement.setInt(5, product.getId());
            
            records = statement.executeUpdate();
        } finally {
            try {
                statement.close();
                
                if (transactionalConnection == null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        
        return records;
    }

    //DELETE
    public int delete(Product product) throws SQLException {
        int records = 0;
        
        try {
            if (transactionalConnection != null) {
                connection = transactionalConnection;
            } else {
                connection = Connect.getConnection();
            }
            
            statement = connection.prepareStatement(SQL_DELETE);
            
            statement.setInt(1, product.getId());
            
            records = statement.executeUpdate();
        } finally {
            try {
                statement.close();
                
                if (transactionalConnection == null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        
        return records;
    }
}
