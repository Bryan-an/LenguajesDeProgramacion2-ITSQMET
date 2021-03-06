/*
 * Delivery driver Controller
 */
package business;

import data.*;
import domain.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import ui.components.*;

/**
 *
 * @author Bryan Andagoya
 */
public class DeliveryDriverController {

    public static List<Object[]> getOrders(int deliveryDriverId) {

        try {
            InvoiceDAO invoiceDAO = new InvoiceDAO(null);
            return invoiceDAO.selectOrders(deliveryDriverId);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }

        return null;
    }

    public static boolean updateDeliveryDriver(int id, ArrayList<JTextField> fields) {
        Connection connection = null;

        try {
            DeliveryDriver deliveryDriver = new DeliveryDriver(id,
                    fields.get(0).getText(),
                    fields.get(1).getText(),
                    fields.get(2).getText(),
                    fields.get(3).getText(),
                    fields.get(4).getText(),
                    fields.get(5).getText(),
                    fields.get(6).getText());

            connection = Connect.getConnection();
            connection.setAutoCommit(false);

            DeliveryDriverDAO deliveryDriverDAO = new DeliveryDriverDAO(connection);

            if (deliveryDriverDAO.update(deliveryDriver) != 0) {
                connection.commit();
                return true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            try {
                if (connection != null) {
                    connection.rollback();
                    connection.close();
                }
            } catch (SQLException ex1) {
                ex.printStackTrace(System.out);
            }
        }

        return false;
    }

    public static boolean validateFields(JFrame frame, int id, JTextField name,
            JTextField lastName, JTextField document, JTextField email,
            JTextField phone, JTextField address, JTextField licensePlate) {

        CustomerDAO customerDAO = new CustomerDAO(null);
        ManagerDAO managerDAO = new ManagerDAO(null);
        DeliveryDriverDAO deliveryDriverDAO = new DeliveryDriverDAO(null);

        boolean empty = name.getText().isEmpty()
                || lastName.getText().isEmpty()
                || document.getText().isEmpty()
                || email.getText().isEmpty()
                || phone.getText().isEmpty()
                || address.getText().isEmpty()
                || licensePlate.getText().isEmpty();
        try {
            if (empty) {
                JOptionPane.showMessageDialog(frame, "Todos los campos son obligatorios",
                        "Informaci??n incompleta", JOptionPane.ERROR_MESSAGE,
                        Icons.ERROR_MESSAGE);

                return false;
            }

            if (!(document.getText().length() == 10)) {

                JOptionPane.showMessageDialog(frame, "N??mero de c??dula inv??lido",
                        "Informaci??n inv??lida", JOptionPane.ERROR_MESSAGE,
                        Icons.ERROR_MESSAGE);

                return false;

            }

            if (customerDAO.select(document.getText(), Constants.DOCUMENT)
                    || managerDAO.select(document.getText(), Constants.DOCUMENT)
                    || deliveryDriverDAO.select(document.getText(), Constants.DOCUMENT, "AND id <> " + id)) {

                JOptionPane.showMessageDialog(frame,
                        "Dicho n??mero de c??dula ya se encuentra\nregistrado en otra cuenta",
                        "Informaci??n inv??lida", JOptionPane.ERROR_MESSAGE,
                        Icons.ERROR_MESSAGE);

                return false;

            }

            if (!email.getText().matches("^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$")) {

                JOptionPane.showMessageDialog(frame, "Correo electr??nico inv??lido",
                        "Informaci??n inv??lida",
                        JOptionPane.ERROR_MESSAGE, Icons.ERROR_MESSAGE);

                return false;

            }

            if (!(phone.getText().length() == 10 || phone.getText().length() == 7)) {

                JOptionPane.showMessageDialog(frame,
                        "El n??mero de tel??fono debe contener 10 o 7 d??gitos",
                        "Informaci??n inv??lida",
                        JOptionPane.ERROR_MESSAGE, Icons.ERROR_MESSAGE);

                return false;

            }

            if (!(licensePlate.getText().length() == 7
                    || licensePlate.getText().length() == 6)) {

                JOptionPane.showMessageDialog(frame,
                        "El n??mero de placa debe contener 3 letras y 3 o 4 d??gigos",
                        "Informaci??n inv??lida",
                        JOptionPane.ERROR_MESSAGE, Icons.ERROR_MESSAGE);

                return false;

            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            return false;
        }

        return true;
    }
}
