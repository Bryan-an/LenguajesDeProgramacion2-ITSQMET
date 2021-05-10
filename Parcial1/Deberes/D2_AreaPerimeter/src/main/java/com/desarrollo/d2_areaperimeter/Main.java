/*
Homework 2: Areas and perimeters
 */
package com.desarrollo.d2_areaperimeter;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Bryan on 10/5/2021
 *
 * @author bryan
 */
public class Main {

    //Fields
    private Scanner sc = new Scanner(System.in);
    private byte optionSubmenu, optionMainMenu;
    private Area area;
    private Perimeter perimeter;
    private DecimalFormat df = new DecimalFormat("0.00");

    /**
     * Constructor of Main class.
     */
    public Main() {
        displayMenu();
    }

    /**
     * Main method.
     *
     * @param args
     */
    public static void main(String[] args) {
        new Main();
    }

    /**
     * Method that displays the main menu.
     */
    public void displayMenu() {

        System.out.println("\n--------------Deber 2: Areas y perímetros----------------");
        do {
            try {
                //Main menu
                System.out.println("\n-------------Menú principal-------------\n1. Área\n2. Perímetro\n3. Salir\nDigite una opción:");
                optionMainMenu = sc.nextByte();
                switch (optionMainMenu) {
                    case 1:
                        //Area
                        do {
                            displaySubmenu();
                            switch (optionSubmenu) {
                                case 1: //Triangle
                                    askTriangle();
                                    System.out.println("\nEl área del triángulo es: " + df.format(area.getTriangleArea()) + " cm²");
                                    break;
                                case 2: //Rectangle
                                    askRectangle();
                                    System.out.println("\nEl área del rectángulo es: " + df.format(area.getRectangleArea()) + " cm²");
                                    break;
                            }
                        } while (optionSubmenu != 3);
                        break;
                    case 2:
                        //Perimeter
                        do {
                            displaySubmenu();
                            switch (optionSubmenu) {
                                case 1: //Triangle
                                    askTriangle();
                                    System.out.println("\nEl perímetro del triángulo es: " + df.format(perimeter.getTrianglePerimeter()) + " cm");
                                    break;
                                case 2: //Rectangle
                                    askRectangle();
                                    System.out.println("\nEl perímetro del rectángulo es: " + df.format(perimeter.getRectanglePerimeter()) + " cm");
                                    break;
                            }
                        } while (optionSubmenu != 3);
                        break;
                    case 3: //Exit
                        System.out.println("\nPrograma finalizado correctamente");
                        break;
                    default:
                        System.out.println("\nOpción inválida, intente de nuevo.");
                }
            } catch (Exception e) {
                sc.nextLine();
                System.out.println("\nError, " + e.getMessage());
            }
        } while (optionMainMenu != 3);

    }

    /**
     * Method that displays the submenu.
     *
     * @return Submenu option number.
     */
    public byte displaySubmenu() {
        boolean exit;
        do {
            exit = true;
            try {
                System.out.println("\n1. Triángulo isósceles\n2. Rectángulo\n3. Salir\nDigite una opción:");
                optionSubmenu = sc.nextByte();
                if (!(optionSubmenu >= 1 && optionSubmenu <= 3)) {
                    System.out.println("\nOpción inválida, intente de nuevo.");
                    exit = false;
                }
            } catch (Exception e) {
                sc.nextLine();
                exit = false;
                System.out.println("\nError: " + e.getMessage());
            }
        } while (!exit);
        return optionSubmenu;
    }

    /**
     * Method that asks for the measurements of the triangle.
     */
    public void askTriangle() {
        double side1, side2, side3;
        boolean aux = false, aux2 = false;;

        side1 = askMeasure("\nDigite la medida del primer lado (cm):");
        side2 = askMeasure("\nDigite la medida del segundo lado (cm):");
        if (side2 == side1) {
            aux = true;
        }
        do {
            side3 = askMeasure("\nDigite la medida del tercer lado (cm):");
            if (aux) {
                if (side3 == side2) {
                    System.out.println("\nMedida incorrecta, recuerde que es un triángulo isósceles");
                } else {
                    if (side3 >= (side1 * 2)) {
                        System.out.println("\nMedida incorrecta, el triangulo no existe");
                    } else {
                        aux2 = true;
                    }
                }
            } else {
                if (side3 == side1) {
                    if (side2 >= (side1 * 2)) {
                        System.out.println("\nMedida incorrecta, el triangulo no existe");
                    } else {
                        aux2 = true;
                    }
                } else if (side3 == side2) {
                    if (side1 >= (side2 * 2)) {
                        System.out.println("\nMedida incorrecta, el triangulo no existe");
                    } else {
                        aux2 = true;
                    }
                } else {
                    System.out.println("\nMedida incorrecta, recuerde que es un triángulo isósceles");
                }
            }
        } while (!aux2);
        //Call the constructor
        switch (optionMainMenu) {
            case 1:
                area = new Area(side1, side2, side3);
                break;
            case 2:
                perimeter = new Perimeter(side1, side2, side3);
                break;
        }

    }

    /**
     * Method that asks for the measurements of the rectangle.
     */
    public void askRectangle() {
        double base, height;

        base = askMeasure("\nDigite la medida de la base (cm):");
        do {
            height = askMeasure("\nDigite la medida de la altura (cm):");
            if (height == base) {
                System.out.println("\nMedida incorrecta, recuerde que es un rectángulo");
            }
        } while (height == base);
        //Call the constructor
        switch (optionMainMenu) {
            case 1:
                area = new Area(base, height);
                break;
            case 2:
                perimeter = new Perimeter(base, height);
                break;
        }
    }

    /**
     * Method that asks for a measure.
     *
     * @param order The order to the user.
     * @return The valid measure.
     */
    public double askMeasure(String order) {
        double measure = 0;
        boolean exit;
        do {
            exit = false;
            try {
                System.out.println(order);
                measure = sc.nextDouble();
                if (measure > 0) {
                    exit = true;
                } else {
                    System.out.println("\nDigite una medida válida");
                }
            } catch (Exception e) {
                sc.nextLine();
                System.out.println("\nError: " + e.getMessage());
            }
        } while (!exit);
        return measure;
    }

}
