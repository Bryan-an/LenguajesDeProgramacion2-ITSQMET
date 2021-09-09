/*
 * Sign In Controller
 */
package business;

import data.*;
import domain.*;
import java.sql.*;
import javax.swing.*;
import ui.components.*;

/**
 *
 * @author Bryan Andagoya
 */
public class SignInController {

    public static final String DEFAULT_NAME = "Nombre";
    public static final String DEFAULT_LAST_NAME = "Apellido";
    public static final String DEFAULT_DOCUMENT = "Cédula de identidad";
    public static final String DEFAULT_EMAIL = "Correo electrónico";
    public static final String DEFAULT_PASSWORD = "Contraseña";
    public static final String DEFAULT_CONFIRM_PASSWORD = "Confirmar contraseña";
    public static final String DEFAULT_PHONE = "Teléfono";
    public static final String DEFAULT_ADDRESS = "Dirección";
    public static final String DEFAULT_USER = "Usuario";
    public static final String DEFAULT_DEPARTMENT = "Departamento";
    public static final String DEFAULT_LICENSE_PLATE = "Placa vehicular";

    private static String userType;
    private static String name;
    private static String lastName;
    private static String document;
    private static String phone;
    private static String address;
    private static String email;
    private static String user;
    private static String password;
    private static String department;
    private static String licensePlate;

    public static boolean validateFields(JFrame frame, JComboBox userType,
            JTextField name, JTextField lastName, JTextField document,
            JTextField phone, JTextField address, JTextField email,
            JTextField user, JPasswordField password, JPasswordField confirmPassword,
            JTextField department, JTextField licensePlate, JCheckBox acceptConditions) {

        CustomerDAO customerDAO = new CustomerDAO(null);
        ManagerDAO managerDAO = new ManagerDAO(null);
        DeliveryDriverDAO deliveryDriverDAO = new DeliveryDriverDAO(null);

        boolean empty = name.getText().equals(DEFAULT_NAME)
                || lastName.getText().equals(DEFAULT_LAST_NAME)
                || document.getText().equals(DEFAULT_DOCUMENT)
                || phone.getText().equals(DEFAULT_PHONE)
                || address.getText().equals(DEFAULT_ADDRESS)
                || email.getText().equals(DEFAULT_EMAIL)
                || user.getText().equals(DEFAULT_USER)
                || String.valueOf(password.getPassword()).equals(DEFAULT_PASSWORD)
                || String.valueOf(confirmPassword.getPassword()).equals(DEFAULT_CONFIRM_PASSWORD);

        switch ((String) userType.getSelectedItem()) {
            case "Administrador":
                empty = empty || department.getText().equals(DEFAULT_DEPARTMENT);
                break;
            case "Delivery":
                empty = empty || licensePlate.getText().equals(DEFAULT_LICENSE_PLATE);
                break;
        }

        try {
            if (empty) {
                JOptionPane.showMessageDialog(frame, "Todos los campos son obligatorios",
                        "Información incompleta", JOptionPane.ERROR_MESSAGE,
                        Icons.ERROR_MESSAGE);

                return false;
            }

            if (!(document.getText().length() == 10)) {

                JOptionPane.showMessageDialog(frame, "Número de cédula inválido",
                        "Información inválida", JOptionPane.ERROR_MESSAGE,
                        Icons.ERROR_MESSAGE);

                return false;

            }

            if (customerDAO.select(document.getText(), Constants.DOCUMENT)
                    || managerDAO.select(document.getText(), Constants.DOCUMENT)
                    || deliveryDriverDAO.select(document.getText(), Constants.DOCUMENT, null)) {

                JOptionPane.showMessageDialog(frame,
                        "Dicho número de cédula ya se encuentra\nregistrado en otra cuenta",
                        "Información inválida", JOptionPane.ERROR_MESSAGE,
                        Icons.ERROR_MESSAGE);

                return false;

            }

            if (!(phone.getText().length() == 10 || phone.getText().length() == 7)) {

                JOptionPane.showMessageDialog(frame,
                        "El número de teléfono debe contener 10 o 7 dígitos",
                        "Información inválida",
                        JOptionPane.ERROR_MESSAGE, Icons.ERROR_MESSAGE);

                return false;

            }

            if (!email.getText().matches("^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$")) {

                JOptionPane.showMessageDialog(frame, "Correo electrónico inválido",
                        "Información inválida",
                        JOptionPane.ERROR_MESSAGE, Icons.ERROR_MESSAGE);

                return false;

            }

            if (!user.getText().matches("^[A-Za-z]\\w{5,29}$")) {

                JOptionPane.showMessageDialog(frame,
                        "El nombre de usuario debe cumplir lo siguiente:"
                        + "\n- Consta de 6 a 30 caracteres"
                        + "\n- Solo puede contener caracteres alfanuméricos"
                        + "\n- El primer carácter del nombre de usuario debe"
                        + "\n  ser un carácter alfabético",
                        "Información inválida",
                        JOptionPane.ERROR_MESSAGE, Icons.ERROR_MESSAGE);

                return false;

            }

            if (customerDAO.select(user.getText(), Constants.USER)
                    || managerDAO.select(user.getText(), Constants.USER)
                    || deliveryDriverDAO.select(user.getText(), Constants.USER, null)) {

                JOptionPane.showMessageDialog(frame, "Dicho nombre de usuario ya se encuentra en uso",
                        "Información inválida",
                        JOptionPane.ERROR_MESSAGE, Icons.ERROR_MESSAGE);

                return false;

            }

            if (!String.valueOf(password.getPassword())
                    .matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$")) {

                JOptionPane.showMessageDialog(frame,
                        "La contraseña debe cumplir lo siguiente:"
                        + "\n- Contener al menos un dígito"
                        + "\n- Contener al menos un carácter en minúscula"
                        + "\n- Contener al menos un carácter en mayúscula"
                        + "\n- Contener al menos un carácter especial como ! @ # & ( )"
                        + "\n- Contener una longitud de al menos 8 caracteres"
                        + "\n  y un máximo de 20 caracteres",
                        "Información inválida",
                        JOptionPane.ERROR_MESSAGE, Icons.ERROR_MESSAGE);

                return false;

            }

            if (!String.valueOf(confirmPassword.getPassword())
                    .equals(String.valueOf(password.getPassword()))) {

                JOptionPane.showMessageDialog(frame, "Las contraseñas no coinciden",
                        "Información inválida",
                        JOptionPane.ERROR_MESSAGE, Icons.ERROR_MESSAGE);

                return false;

            }

            if (userType.getSelectedItem().equals("Delivery")) {
                if (!(licensePlate.getText().length() == 7
                        || licensePlate.getText().length() == 6)) {

                    JOptionPane.showMessageDialog(frame,
                            "El número de placa debe contener 3 letras y 3 o 4 dígigos",
                            "Información inválida",
                            JOptionPane.ERROR_MESSAGE, Icons.ERROR_MESSAGE);

                    return false;

                }
            }

            if (!acceptConditions.isSelected()) {

                JOptionPane.showMessageDialog(frame,
                        "Debe aceptar los términos y condiciones para poder continuar",
                        "Términos y condiciones",
                        JOptionPane.ERROR_MESSAGE, Icons.ERROR_MESSAGE);

                return false;
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            return false;
        }

        SignInController.userType = (String) userType.getSelectedItem();
        SignInController.name = name.getText();
        SignInController.lastName = lastName.getText();
        SignInController.document = document.getText();
        SignInController.phone = phone.getText();
        SignInController.address = address.getText();
        SignInController.email = email.getText();
        SignInController.user = user.getText();
        SignInController.password = String.valueOf(password.getPassword());

        if (SignInController.userType.equals("Administrador")) {
            SignInController.department = department.getText();
        } else if (SignInController.userType.equals("Delivery")) {
            SignInController.licensePlate = licensePlate.getText();
        }

        return true;
    }

    public static void register(JFrame frame) {
        Connection connection = null;

        try {
            connection = Connect.getConnection();
            connection.setAutoCommit(false);

            switch (userType) {
                case "Cliente":
                    CustomerDAO customerDAO = new CustomerDAO(connection);
                    Customer customer = new Customer(document, name, lastName, user, password, email, phone, address);
                    customerDAO.insert(customer);
                    break;
                case "Administrador":
                    ManagerDAO managerDAO = new ManagerDAO(connection);
                    Manager manager = new Manager(document, name, lastName, user, password, email, phone, address, department);
                    managerDAO.insert(manager);
                    break;
                case "Delivery":
                    DeliveryDriverDAO deliveryDriverDAO = new DeliveryDriverDAO(connection);
                    DeliveryDriver deliveryDriver = new DeliveryDriver(document, name, lastName, user, password, email, phone, address, licensePlate);
                    deliveryDriverDAO.insert(deliveryDriver);
                    break;
            }

            connection.commit();

            JOptionPane.showMessageDialog(frame,
                    "Registro exitoso",
                    "Éxito",
                    JOptionPane.INFORMATION_MESSAGE, Icons.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
            try {
                if (connection != null) {
                    connection.rollback();
                }
            } catch (SQLException ex1) {
                ex.printStackTrace(System.out);
            }
        }
    }

}
