/*
 * Log In Controller
 */
package business;

import data.*;
import domain.*;
import java.sql.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import ui.*;

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
    //
    public static boolean exist=false;
    //Interfaces
    public static CustomerMenu Cmenu;
    public static ManagerMenu mMenu;
    

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
                    exist= LogInController.user != null;
                    break;
                case CUSTOMER:
                    CustomerDAO customer = new CustomerDAO(null);
                    LogInController.user = customer.select(user.getText(),
                            String.valueOf(password.getPassword()));
                    LogInController.userType = userType;
                    exist= LogInController.user != null;
                    
                    break;

                case DELIVERY_DRIVER:
                    DeliveryDriverDAO deliveryDriver = new DeliveryDriverDAO(null);
                    LogInController.user = deliveryDriver.select(user.getText(),
                            String.valueOf(password.getPassword()));
                    LogInController.userType = userType;
                    exist=LogInController.user != null;
                    break;
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            
        }
        return exist;
    }

    public static void getInto() {
        switch (userType) {
            case MANAGER:
//                System.out.println("Manager UI");
                if (exist) {
                    ManagerMenu.manager=(Manager)LogInController.user;
                    mMenu=new ManagerMenu();
                    mMenu.setVisible(true);
                }
                break;
            case CUSTOMER:
//                System.out.println("Customer UI");
                if (exist) {
                    CustomerMenu.customer=(Customer)LogInController.user;
                    Cmenu=new CustomerMenu();
                    Cmenu.setVisible(true);
                }
                break;
            case DELIVERY_DRIVER:
                new DeliveryDriverUI((DeliveryDriver) user).setVisible(true);
                break;
        }
    }

    
    
    
    
    //    public static boolean exists(JTextField user, JPasswordField password, UserType userType) {
//        try {
//            switch (userType) {
//                case MANAGER -> {
//                    ManagerDAO manager = new ManagerDAO(null);
//                    LogInController.user = manager.select(user.getText(),
//                            String.valueOf(password.getPassword()));
//                    LogInController.userType = userType;
//                    return LogInController.user != null;
//                }
//
//                case CUSTOMER -> {
//                    CustomerDAO customer = new CustomerDAO(null);
//                    LogInController.user = customer.select(user.getText(),
//                            String.valueOf(password.getPassword()));
//                    LogInController.userType = userType;
//                    return LogInController.user != null;
//                }
//
//                case DELIVERY_DRIVER -> {
//                    DeliveryDriverDAO deliveryDriver = new DeliveryDriverDAO(null);
//                    LogInController.user = deliveryDriver.select(user.getText(),
//                            String.valueOf(password.getPassword()));
//                    LogInController.userType = userType;
//                    return LogInController.user != null;
//                }
//            }
//
//        } catch (SQLException ex) {
//            ex.printStackTrace(System.out);
//        }
//
//        return false;
//    }
//
//    public static void getInto() {
//        switch (userType) {
//            case MANAGER ->
//                System.out.println("Manager UI");
//            case CUSTOMER ->
//                System.out.println("Customer UI");
//            case DELIVERY_DRIVER ->
//                new DeliveryDriverUI((DeliveryDriver) user).setVisible(true);
//        }
//    }
}
