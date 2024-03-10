package com.unige.triangle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TriangleTest {

    // Triangle triangle;

    // public void setUp(){
    //     triangle = new Triangle(2, 3, 1);
    // }
    // @Test
    // void testCheckEquilateralType() {
    //     Triangle triangle = new Triangle(2,2,2);
    //     assertEquals(true, triangle.isValid());
    //     assertEquals(TriangleType.Equilateral, triangle.CheckType());
    //     assertEquals(false, triangle.isRight());
    // }

    // @Test
    // void testCheckIsoscelesType() {
    //     Triangle triangle = new Triangle(2,2,1);
    //     assertEquals(true, triangle.isValid());
    //     assertEquals(TriangleType.Isosceles, triangle.CheckType());
    //     assertEquals(false, triangle.isRight());
    // }

    // @Test
    // void testCheckScalenesType() {
    //     Triangle triangle = new Triangle(4,2,5);
    //     assertEquals(true, triangle.isValid());
    //     assertEquals(TriangleType.Scalene, triangle.CheckType());
    //     assertEquals(false, triangle.isRight());
    // }

    // @Test
    // void testCheckInvalidType() {
    //     Triangle triangle = new Triangle(4,2,1);
    //     assertEquals(false, triangle.isValid());
    //     assertEquals(TriangleType.INVALID, triangle.CheckType());
    //     assertEquals(false, triangle.isRight());
    // }

    // @Test
    // void testRight(){
    //     Triangle triangle = new Triangle(3, 4, 5);
    //     assertEquals(true, triangle.isRight()); 
    // }

    @Test
    void testValidTriangle() {
        Triangle triangle = new Triangle(3, 4, 5);
        assertTrue(triangle.isValid());
    }

    @Test
    void testInvalidTriangle() {
        Triangle triangle = new Triangle(1, 2, 3);
        assertFalse(triangle.isValid());
    }

    @Test
    void testEquilateralTriangle() {
        Triangle triangle = new Triangle(2, 2, 2);
        assertEquals(TriangleType.Equilateral, triangle.CheckType());
    }

    @Test
    void testIsoscelesTriangle() {
        Triangle triangle = new Triangle(3, 3, 2);
        assertEquals(TriangleType.Isosceles, triangle.CheckType());
    }

    @Test
    void testScaleneTriangle() {
        Triangle triangle = new Triangle(3, 4, 5);
        assertEquals(TriangleType.Scalene, triangle.CheckType());
    }

    @Test
    void testRightTriangle() {
        Triangle triangle = new Triangle(3, 4, 5);
        assertTrue(triangle.isRight());
    }

    @Test
    void testNotRightTriangle() {
        Triangle triangle = new Triangle(2, 3, 4);
        assertFalse(triangle.isRight());
    }
}

