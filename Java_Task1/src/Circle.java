public class Circle {
    private double radius =1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle: radius:" + radius + "  color:" + color;
    }
    public double getArea()
    {
        return Math.PI * radius * radius;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Circle circ = (Circle)obj;
        return radius == circ.radius && color.equals(circ.color);
    }

    @Override
    public int hashCode() {
        int result = color.hashCode();
        long f = Double.doubleToLongBits(radius);
        result += (int)(f^(f >>> 32));
        return result;
    }
}
