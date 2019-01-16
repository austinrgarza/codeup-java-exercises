package shapes;

public class Circle {

    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getArea() {
        return Math.PI * (radius * radius);
    }

    public double getCircumfrence() {
        return 2 * Math.PI * radius;
    }

}

