/**
 * Implements a class that encapsulates data and methods for representing a circle
 * @Sanjana 
 * @version 1.0
 * @since 2024-09-19
 */
import java.lang.Math;

class Circle {
        /** The side length of the square **/
    private double radius = 1.0;

        /** The perimeter of the square **/
    private double circumference = 2* Math.PI;

        /** The area of the square **/
    private double areaCircle = Math.PI;

    
    /**
     * Constructor
     * @param side double representing the side length. Assumes positive non-zero 
     */
    public Circle(double r) {
        radius = r;
        circumference = 2 * Math.PI * radius;
        areaCircle = Math.PI * radius * radius;
    }

    /**
     * Gets radius
     * @return double representing radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Gets Circumference
     * @return double representing circumference
     */
    public double getCircumference() {
        return circumference;
    }

    /**
     * Gets area
     * @return double representing area
     */
    public double getAreaCircle() {
        return areaCircle;
    }

    /**
     * Sets radius. Circumference and area are updated
     * @param r double representing the new radius.
     */
    public void setRadius(double r) {
        radius = r;
        circumference = 2 * Math.PI * radius; // calculate circumference
        // calculate the area
        areaCircle = Math.PI * radius * radius;
    }

    /**
     * Sets area. Circumference and radius are updated
     */
    public void setAreaCircle(double a) {
        areaCircle = a;
        radius = Math.sqrt(areaCircle/Math.PI);
        circumference = 2 * Math.PI * radius; 
    }


    /**
     * Sets circumference. Area and radius are updated
     */
    public void setCircumference(double c) {
        circumference = c;
        radius = circumference/(2*Math.PI);
        areaCircle = Math.PI * radius * radius;
    }
}
