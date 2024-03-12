package com.unige.triangle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TriangleApplicationTests {


    @Test
    void testCheckEquilateralType() {
        Triangle triangle = new Triangle(2,2,2);
        assertEquals(true, triangle.isValid());
        assertEquals(TriangleType.Equilateral, triangle.CheckType());
        assertEquals(false, triangle.isRight());
    }

    @Test
    void testCheckIsoscelesType() {
        Triangle triangle = new Triangle(2,2,1);
        assertEquals(true, triangle.isValid());
        assertEquals(TriangleType.Isosceles, triangle.CheckType());
        assertEquals(false, triangle.isRight());
    }

    @Test
    void testCheckScalenesType() {
        Triangle triangle = new Triangle(4,2,5);
        assertEquals(true, triangle.isValid());
        assertEquals(TriangleType.Scalene, triangle.CheckType());
        assertEquals(false, triangle.isRight());
    }

    @Test
    void testCheckInvalidType() {
        Triangle triangle = new Triangle(4,2,1);
        assertEquals(false, triangle.isValid());
        assertEquals(TriangleType.INVALID, triangle.CheckType());
        assertEquals(false, triangle.isRight());
    }

    @Test
    void testRight(){
        Triangle triangle = new Triangle(3, 4, 5);
        assertEquals(true, triangle.isRight()); 
    }
}
