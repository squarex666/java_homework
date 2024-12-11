package Java_4.first_task;

/**
 * Java_4
 * Задания по вариантам. Вариант 9
 */

abstract class Figure {
    public abstract double area();

    public abstract String toString();
}

class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public String toString() {
        return "Rectangle [length=" + length + ", width=" + width + "]";
    }
}

class Triangle extends Figure {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }

    @Override
    public String toString() {
        return "Triangle [base=" + base + ", height=" + height + "]";
    }
}

class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }
}

class Geometry {
    private Figure[] figures;
    private int count;

    public Geometry() {
        this.figures = new Figure[10];
        this.count = 0;
    }


    public void addFigure(Figure figure) {
        if (count < figures.length) {
            figures[count] = figure;
            count++;
        } else {
            System.out.println("Cannot add more figures, array is full!");
        }
    }

    public void removeFigure(int index) {
        if (index >= 0 && index < count) {
            for (int i = index; i < count - 1; i++) {
                figures[i] = figures[i + 1];
            }
            figures[count - 1] = null;
            count--;
        } else {
            System.out.println("Invalid index for removal!");
        }
    }

    public int countFigures(Class<?> figureClass) {
        int countFigures = 0;
        for (int i = 0; i < count; i++) {
            if (figureClass.isInstance(figures[i])) {
                countFigures++;
            }
        }
        return countFigures;
    }

    public double totalArea() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += figures[i].area();
        }
        return total;
    }

    public void printFigures() {
        for (int i = 0; i < count; i++) {
            System.out.println(figures[i].toString() + " - Area: " + figures[i].area());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 3);
        Triangle triangle = new Triangle(4, 2);
        Circle circle = new Circle(3);

        Geometry geometry = new Geometry();
        geometry.addFigure(rectangle);
        geometry.addFigure(triangle);
        geometry.addFigure(circle);

        geometry.printFigures();

        System.out.println("Total Area of all figures: " + geometry.totalArea());

        System.out.println("Number of Rectangles: " + geometry.countFigures(Rectangle.class));
        System.out.println("Number of Triangles: " + geometry.countFigures(Triangle.class));
        System.out.println("Number of Circles: " + geometry.countFigures(Circle.class));

        geometry.removeFigure(1);
        System.out.println("After removal:");
        geometry.printFigures();
    }
}
