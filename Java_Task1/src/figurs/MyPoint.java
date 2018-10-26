package figurs;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class MyPoint {
    private int x =0;
    private int y =0;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public int[] getXY(){
        int[] result = {x,y};
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
    public double distance(int x,int y){
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
}
