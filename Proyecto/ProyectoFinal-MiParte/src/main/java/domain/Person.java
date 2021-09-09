/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Bryan Andagoya
 */
public abstract class Person {

    protected int id;
    protected String document;
    protected String name;
    protected String lastName;
    protected String user;
    protected String password;
    protected String email;
    protected String phone;
    protected String address;

    //DELETE
    public Person(int id) {
        this.id = id;
    }

    //INSERT 
    public Person(String document, String name, String lastName, String user, String password, String email, String phone, String address) {
        this.document = document;
        this.name = name;
        this.lastName = lastName;
        this.user = user;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    //UPDATE - SELECT 
    public Person(int id, String document, String name, String lastName, String user, String password, String email, String phone, String address) {
        this.id = id;
        this.document = document;
        this.name = name;
        this.lastName = lastName;
        this.user = user;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    //getter - setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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
        return "id=" + id + ", document=" + document + ", name=" + name + ", lastName=" + lastName + ", user=" + user + ", password=" + password + ", email=" + email + ", phone=" + phone + ", address=" + address;
    }

}
