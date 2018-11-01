public class Rectangle {
    private float length = 1.0f;
    private float width = 1.0f;

    public Rectangle() {
    }

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea()
    {
        return length*width;
    }

    public double getPerimeter()
    {
        return 2*length + 2*width;
    }

    @Override
    public String toString() {
        return "Rectangle: length:" + length +" width:" + width;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Rectangle rec = (Rectangle) obj;
        return length == rec.length && width == rec.width;
    }

    @Override
    public int hashCode() {
        int result = Float.floatToIntBits(length);
        result += Float.floatToIntBits(width);
        return  result;
    }
}
