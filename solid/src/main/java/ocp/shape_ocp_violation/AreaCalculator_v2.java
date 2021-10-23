package ocp.shape_ocp_violation;

public class AreaCalculator_v2 {
    public double areaCalc(Object... shapes) {
        double area = 0;
        for (var shape : shapes) {
            if (shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape;
                area += rectangle.getWidth() * rectangle.getHeight();
            }
            else {
                Circle circle = (Circle) shape;
                area += Math.pow(circle.getRadius(), 2) * Math.PI;
            }
        }

        return area;
    }
}
