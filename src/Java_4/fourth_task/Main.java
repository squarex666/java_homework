package Java_4.fourth_task;

/**
 * Java_4
 * Задания по вариантам. Вариант 9
 */

class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void scale(double factor) {
        this.x *= factor;
        this.y *= factor;
    }

    @Override
    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }
}

class Point3D extends Point {
    private double z;

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public void scale(double factor) {
        super.scale(factor);
        this.z *= factor;
    }

    @Override
    public String toString() {
        return "Point3D(" + getX() + ", " + getY() + ", " + z + ")";
    }
}

public class Main {
    public static void main(String[] args) {
        Point point2D = new Point(2.0, 3.0);
        System.out.println("Original 2D point: " + point2D);

        point2D.scale(2.0);
        System.out.println("Scaled 2D point: " + point2D);

        Point3D point3D = new Point3D(2.0, 3.0, 4.0);
        System.out.println("Original 3D point: " + point3D);

        point3D.scale(2.0);
        System.out.println("Scaled 3D point: " + point3D);
    }
}
