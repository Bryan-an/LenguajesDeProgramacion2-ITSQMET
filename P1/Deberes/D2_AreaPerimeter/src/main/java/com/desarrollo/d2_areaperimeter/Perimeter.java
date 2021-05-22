/*
Homework 2: Areas and perimeters
 */
package com.desarrollo.d2_areaperimeter;

/**
 * Created by Bryan on 10/5/2021
 *
 * @author bryan
 */
public class Perimeter {

    //Fields
    private double trianglePerimeter;
    private double rectanglePerimeter;

    //Getters
    /**
     * Get the perimeter of the triangle.
     *
     * @return The perimeter of the triangle.
     */
    public double getTrianglePerimeter() {
        return trianglePerimeter;
    }

    /**
     * Get the perimeter of the rectangle.
     *
     * @return The perimeter of the rectangle.
     */
    public double getRectanglePerimeter() {
        return rectanglePerimeter;
    }

    //Constructors
    /**
     * Constructor of Perimeter class - triangle.
     *
     * @param side1 Side 1 of the triangle.
     * @param side2 Side 2 of the triangle.
     * @param side3 Side 3 of the triangle.
     */
    public Perimeter(double side1, double side2, double side3) {
        calcTrianglePerimeter(side1, side2, side3);
    }

    /**
     * Constructor of Perimeter class - rectangle.
     *
     * @param base Base of the rectangle.
     * @param height Height of the rectangle.
     */
    public Perimeter(double base, double height) {
        calcRectanglePerimeter(base, height);
    }

    //Methods
    /**
     * Method that calculates the perimeter of the triangle.
     *
     * @param side1 Side 1 of the triangle.
     * @param side2 Side 2 of the triangle.
     * @param side3 Side 3 of the triangle.
     */
    public void calcTrianglePerimeter(double side1, double side2, double side3) {
        trianglePerimeter = side1 + side2 + side3;
    }

    /**
     * Method that calculates the perimeter of the rectangle.
     *
     * @param base Base of the rectangle.
     * @param height Height of the rectangle.
     */
    public void calcRectanglePerimeter(double base, double height) {
        rectanglePerimeter = (2 * base) + (2 * height);
    }
}
