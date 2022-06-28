import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleClassTest {
    double rectangleLength;
    double rectangleWidth;
    RectangleClass rectangleClass;

    @BeforeEach
    void setUp() {
        rectangleClass = new RectangleClass();
    }

    @Test
    void testThatRectangleHasLength(){
        rectangleLength  = 5.8;
        rectangleClass.setRectangleLength(rectangleLength);
        assertEquals(5.8, rectangleClass.getRectangleLength());
    }

    @Test
    void testThatRectangleHasWidth(){
        rectangleWidth = 4.8;
        rectangleClass.setRectangleWidth(rectangleWidth);
        assertEquals(4.8, rectangleClass.getRectangleWidth());
    }

    @Test
    void testThatRectangleHasArea(){
        double area = 12.2;
        rectangleClass.setArea(area);
        assertEquals(12.2, rectangleClass.getArea());
    }

    @Test
    void testThatRectangleHasPerimeter(){
        double perimeter = 3.5;
        rectangleClass.setPerimeter(perimeter);
        assertEquals(3.5, rectangleClass.getPerimeter());
    }
}
