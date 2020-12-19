package com.learn.shape;

/**
 * @author Demon.Lee
 * @date 2020-12-19 16:06
 * @desc
 */
public class ShapeTest {

    public static void main(String[] args) {
        Cube cube = new Cube(9.0);
        System.out.println("cube.width: " + cube.getWidth());
        System.out.println("cube.area: " + cube.getArea());
        System.out.println("cube.circumference: " + cube.getCircumference());
    }
}
