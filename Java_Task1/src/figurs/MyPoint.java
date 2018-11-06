package figurs;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class MyPoint {
    private double x =0;
    private double y =0;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public double[] getXY(){
        double[] result = {x,y};
        return result;

    }

    public void setXY(int x,int y) {
        this.x=x;
        this.y=y;
    }

    @Override
    public String toString() {
        return "( " + x +" , " + y +" )";
    }

    public double distance(double x,double y){
        double result =0;
        result = sqrt(pow(x - this.x,2) + pow(y-this.y,2));
        return result;
    }

    public  double distance(MyPoint point){
        return distance(point.getX(),point.getY());
    }

    public  double distance(){
        return distance(0,0);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        MyPoint point = (MyPoint) obj;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        int result = 0;
        long f = Double.doubleToLongBits(x);
        result += (int)(f^(f >>> 32));
        f = Double.doubleToLongBits(y);
        result += (int)(f^(f >>> 32));
        return result;
    }
}
