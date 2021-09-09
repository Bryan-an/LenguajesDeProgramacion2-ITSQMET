/*
 * Delivery Driver 
 */
package domain;

/**
 *
 * @author Bryan Andagoya
 */
public class DeliveryDriver extends Person {

    private String licensePlate;

    //DELETE
    public DeliveryDriver(int id) {
        super(id);
    }

    //INSERT 
    public DeliveryDriver(String document, String name, String lastName, String user, String password, String email, String phone, String address, String licensePlate) {
        super(document, name, lastName, user, password, email, phone, address);
        this.licensePlate = licensePlate;
    }

    //SELECT 
    public DeliveryDriver(int id, String document, String name, String lastName, String user, String password, String email, String phone, String address, String licensePlate) {
        super(id, document, name, lastName, user, password, email, phone, address);
        this.licensePlate = licensePlate;
    }

    //OJO----------ES NUEVO: CONSTRUCTOR PARA HACEL EL UPDATE SIN USAURIO Y CONTRASEÑA------------
    //UPDATE
    public DeliveryDriver(int id, String name, String lastName, String document, String email, String phone, String address, String licensePlate) {
        super(id, document, name, lastName, null, null, email, phone, address);
        this.licensePlate = licensePlate;
    }

    //getters - setters
    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    //toString
    @Override
    public String toString() {
        return "DeliveryDriver{" + super.toString() + ", licensePlate=" + licensePlate + '}';
    }

}
