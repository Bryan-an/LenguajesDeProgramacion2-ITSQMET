/*
 * Customer
 */
package domain;

/**
 *
 * @author Bryan Andagoya
 */
public class Customer extends Person {

    //DELETE
    public Customer(int id) {
        super(id);
    }

    //INSERT 
    public Customer(String document, String name, String lastName, String user, String password, String email, String phone, String address) {
        super(document, name, lastName, user, password, email, phone, address);
    }

    //UPDATE - SELECT 
    public Customer(int id, String document, String name, String lastName, String user, String password, String email, String phone, String address) {
        super(id, document, name, lastName, user, password, email, phone, address);
    }
    
    //toString

    @Override
    public String toString() {
        return "Customer{" + super.toString() + '}';
    }

    

}
