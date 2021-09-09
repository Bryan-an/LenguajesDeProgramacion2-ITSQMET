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
public class Manager extends Person {

    private String department;

    //DELETE
    public Manager(int id) {
        super(id);
    }

    //INSERT 
    public Manager(String document, String name, String lastName, String user, String password, String email, String phone, String address, String department) {
        super(document, name, lastName, user, password, email, phone, address);
        this.department = department;
    }

    //UPDATE - SELECT 
    public Manager(int id, String document, String name, String lastName, String user, String password, String email, String phone, String address, String department) {
        super(id, document, name, lastName, user, password, email, phone, address);
        this.department = department;
    }

    //getters - setters
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    //toString
    @Override
    public String toString() {
        return "Manager{" + super.toString() + ", department=" + department + '}';
    }

}
