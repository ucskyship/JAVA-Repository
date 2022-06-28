import org.junit.jupiter.api.Test;

/**
 *  this program test a rectangle with attribute
 *  length and width in floating point numbers larger than 0.0 and less than 20.0
 *  default value of width and length is 1
 *  provides the methods that calculate the rectangle perimeter and area
 *  is has a set method has length and width
 *  the get method has length and width
 * */

public class RectangleClass {
    double rectangleLength = 1;
    double rectangleWidth = 1;
    double area;
    double perimeter;

    public void setRectangleLength(double rectangleLength) {
        this.rectangleLength = rectangleLength;
    }
    public double getRectangleLength() {
        return rectangleLength;
    }


    public void setRectangleWidth(double rectangleWidth) {
        this.rectangleWidth = rectangleWidth;
    }
    public double getRectangleWidth() {
        return rectangleWidth;
    }

    public void setArea(double area) {
        this.area = area;
    }
    public double getArea() {
        return area;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getPerimeter() {
        return perimeter;
    }

    @Test
    void testThatExceptionThrowsWhenIllegalValueIsProvided(){
//        illegalArgumentException ex = assertThrows
    }
}
