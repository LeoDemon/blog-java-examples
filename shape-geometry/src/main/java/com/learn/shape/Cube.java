package com.learn.shape;

/**
 * @author Demon.Lee
 * @date 2020-12-19 16:00
 * @desc
 */
public class Cube implements Shape {

    private double width;

    public Cube(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double getCircumference() {
        return 6 * 2 * width;
    }

    @Override
    public double getArea() {
        return 6 * width * width;
    }
}
