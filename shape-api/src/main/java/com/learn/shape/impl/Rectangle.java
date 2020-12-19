package com.learn.shape.impl;

import com.learn.shape.Shape;

/**
 * @author Demon.Lee
 * @date 2020-12-19 15:49
 * @desc
 */
public class Rectangle implements Shape {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getCircumference() {
        return 2 * (width + height);
    }

    @Override
    public double getArea() {
        return width * height;
    }

    // @Override
    // public double getVolume() {
    //     throw new UnsupportedOperationException();
    // }
}
