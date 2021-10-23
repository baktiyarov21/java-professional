package ocp.shape_ocp_violation;

public class Main {
    public static void main(String[] args) {
        var rect1 = new Rectangle(10, 5);
        var rect2 = new Rectangle(20, 37);

        var ac = new AreaCalculator();

        System.out.println(ac.areaCalc(rect1, rect2));

        System.out.println("====================================================");

        var c1 = new Circle(20);
        var c2 = new Circle(17.2);
        var c3 = new Circle(9);

        var ac2 = new AreaCalculator_v2();
        System.out.println(ac2.areaCalc(c1,c2,c3));
    }
}
