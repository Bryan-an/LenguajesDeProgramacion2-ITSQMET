/*
 * Log In Controller
 */
package business;

import data.*;
import domain.*;
import java.sql.*;
import javax.swing.*;
import ui.DeliveryDriverUI;

/**
 *
 * @author Bryan Andagoya
 */
public class LogInController {

    public static final String DEFAULT_USER = "Ingrese su usuario";
    public static final String DEFAULT_PASSWORD = "***********";
    public static final ImageIcon ERROR_ICON = new ImageIcon("src/main/java/ui/images/errorIcon.png");
    private static Person user;
    private static UserType userType;

    public static boolean validateFields(JTextField user, JPasswordField password, ButtonGroup userType) {
        return !(user.getText().equals(DEFAULT_USER)
                || user.getText().isEmpty()
                || String.valueOf(password.getPassword()).equals(DEFAULT_PASSWORD)
                || String.valueOf(password.getPassword()).isEmpty()
                || userType.getSelection() == null);
    }

    public static boolean exists(JTextField user, JPasswordField password, UserType userType) {
        try {
            switch (userType) {
                case MANAGER:
                    ManagerDAO manager = new ManagerDAO(null);
                    LogInController.user = manager.select(user.getText(),
                            String.valueOf(password.getPassword()));
                    LogInController.userType = userType;
                    return LogInController.user != null;

                case CUSTOMER:
                    CustomerDAO customer = new CustomerDAO(null);
                    LogInController.user = customer.select(user.getText(),
                            String.valueOf(password.getPassword()));
                    LogInController.userType = userType;
                    return LogInController.user != null;

                case DELIVERY_DRIVER:
                    DeliveryDriverDAO deliveryDriver = new DeliveryDriverDAO(null);
                    LogInController.user = deliveryDriver.select(user.getText(),
                            String.valueOf(password.getPassword()));
                    LogInController.userType = userType;
                    return LogInController.user != null;
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }

        return false;
    }

    public static void getInto() {
        switch (userType) {
            case MANAGER ->
                System.out.println("Magenager UI");
            case CUSTOMER ->
                System.out.println("Customer UI");
            case DELIVERY_DRIVER ->
                new DeliveryDriverUI((DeliveryDriver) user).setVisible(true);
        }
    }

}
