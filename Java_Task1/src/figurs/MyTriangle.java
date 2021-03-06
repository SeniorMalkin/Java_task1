package figurs;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        v1 = new MyPoint(x1, y1);
        v2 = new MyPoint(x2, y2);
        v3 = new MyPoint(x3, y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return "MyTriangle: " + "  v1: " + v1.toString() + "  v2: " + v2.toString() + "  v3: " + v3.toString();
    }

    public double getPerimeter() {
        double a = v1.distance(v2);
        double b = v1.distance(v3);
        double c = v2.distance(v3);

        return a + b + c;
    }

    public String getType() {
        double a = v1.distance(v2);
        double b = v1.distance(v3);
        double c = v2.distance(v3);
        if ((a == b) && (b == c)) {
            return "Equlateral";
        } else {
            if ((a == b) || (b == c) || (c == a)) {
                return "Isosceles";
            } else {
                return "Scalene";
            }
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        MyTriangle trian = (MyTriangle) obj;
        return v1.equals(trian.v1) && v2.equals(trian.v2) && v3.equals(trian.v3);
    }

    @Override
    public int hashCode() {
    return v1.hashCode() + v2.hashCode() + v3.hashCode();
    }
}
