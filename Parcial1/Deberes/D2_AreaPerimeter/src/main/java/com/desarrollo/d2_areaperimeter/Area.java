/*
Homework 2: Areas and perimeters
 */
package com.desarrollo.d2_areaperimeter;

/**
 * Created by Bryan on 10/5/2021
 *
 * @author bryan
 */
public class Area {

    //Fields
    private double triangleArea;
    private double rectangleArea;

    //Getters
    /**
     * Get the area of the triangle.
     *
     * @return The area of the triangle.
     */
    public double getTriangleArea() {
        return triangleArea;
    }

    /**
     * Get the area of the rectangle.
     *
     * @return The area of the rectangle.
     */
    public double getRectangleArea() {
        return rectangleArea;
    }

    //Constructors
    /**
     * Constructor of Area class - triangle.
     *
     * @param side1 Side 1 of the triangle.
     * @param side2 Side 2 of the triangle.
     * @param side3 Side 3 of the triangle.
     */
    public Area(double side1, double side2, double side3) {
        calcTriangleArea(side1, side2, side3);
    }

    /**
     * Constructor of Area class - rectangle.
     *
     * @param base Base of the rectangle.
     * @param height Height of the rectangle.
     */
    public Area(double base, double height) {
        calcRectangleArea(base, height);
    }

    //Methods
    /**
     * Method that calculates the area of the triangle.
     *
     * @param side1 Side 1 of the triangle.
     * @param side2 Side 2 of the triangle.
     * @param side3 Side 3 of the triangle.
     */
    public void calcTriangleArea(double side1, double side2, double side3) {
        double a = 0, b = 0;
        if (side1 == side2) {
            a = side1;
            b = side3;
        } else if (side1 == side3) {
            a = side1;
            b = side2;
        } else if (side2 == side3) {
            a = side2;
            b = side1;
        }
        triangleArea = (b * (Math.sqrt(Math.pow(a, 2) - (Math.pow(b, 2) / 4)))) / 2;
    }

    /**
     * Method that calculates the area of the rectangle.
     *
     * @param base Base of the rectangle.
     * @param height Height of the rectangle.
     */
    public void calcRectangleArea(double base, double height) {
        rectangleArea = base * height;
    }
}
