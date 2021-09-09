/*
 * Supplier
 */
package domain;

/**
 *
 * @author Bryan Andagoya
 */
public class Supplier {

    private int id;
    private String name;
    private String phone;
    private String email;
    private String address;

    //DELETE
    public Supplier(int id) {
        this.id = id;
    }

    //INSERT
    public Supplier(String name, String phone, String email, String address) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    //UPDATE - SELECT
    public Supplier(int id, String name, String phone, String email, String address) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //toString
    @Override
    public String toString() {
        return "Supplier{" + "id=" + id + ", name=" + name + ", phone=" + phone
                + ", email=" + email + ", address=" + address + '}';
    }

}
