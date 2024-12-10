package Java_4.first_task;

/**
 * Java_4
 * Задания по вариантам. Вариант 9
 */

// Абстрактный класс Figure (Фигура)
abstract class Figure {
    // Абстрактный метод для вычисления площади
    public abstract double area();

    // Переопределенный метод для вывода информации о фигуре
    public abstract String toString();
}

// Класс Rectangle (Прямоугольник)
class Rectangle extends Figure {
    private double length; // Длина
    private double width;  // Ширина

    // Конструктор
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Геттеры и сеттеры
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

    // Переопределение метода для вычисления площади
    @Override
    public double area() {
        return length * width;
    }

    // Переопределение метода toString
    @Override
    public String toString() {
        return "Rectangle [length=" + length + ", width=" + width + "]";
    }
}

// Класс Triangle (Треугольник)
class Triangle extends Figure {
    private double base;   // Основание
    private double height; // Высота

    // Конструктор
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Геттеры и сеттеры
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

    // Переопределение метода для вычисления площади
    @Override
    public double area() {
        return 0.5 * base * height;
    }

    // Переопределение метода toString
    @Override
    public String toString() {
        return "Triangle [base=" + base + ", height=" + height + "]";
    }
}

// Класс Circle (Круг)
class Circle extends Figure {
    private double radius; // Радиус

    // Конструктор
    public Circle(double radius) {
        this.radius = radius;
    }

    // Геттеры и сеттеры
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Переопределение метода для вычисления площади
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    // Переопределение метода toString
    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }
}

// Класс Geometry (Геометрия) для хранения множества фигур
class Geometry {
    private Figure[] figures; // Массив фигур
    private int count;        // Счётчик фигур

    // Конструктор
    public Geometry() {
        this.figures = new Figure[10]; // Инициализируем массив с максимальным размером 10
        this.count = 0;
    }

    // Метод для добавления фигуры
    public void addFigure(Figure figure) {
        if (count < figures.length) {
            figures[count] = figure;
            count++;
        } else {
            System.out.println("Cannot add more figures, array is full!");
        }
    }

    // Метод для удаления фигуры (по индексу)
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

    // Метод для подсчета фигур каждого типа
    public int countFigures(Class<?> figureClass) {
        int countFigures = 0;
        for (int i = 0; i < count; i++) {
            if (figureClass.isInstance(figures[i])) {
                countFigures++;
            }
        }
        return countFigures;
    }

    // Метод для подсчета общей площади всех фигур
    public double totalArea() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += figures[i].area();
        }
        return total;
    }

    // Метод для вывода информации о всех фигурах
    public void printFigures() {
        for (int i = 0; i < count; i++) {
            System.out.println(figures[i].toString() + " - Area: " + figures[i].area());
        }
    }
}

// Главный класс
public class Main {
    public static void main(String[] args) {
        // Создаем несколько фигур
        Rectangle rectangle = new Rectangle(5, 3);
        Triangle triangle = new Triangle(4, 2);
        Circle circle = new Circle(3);

        // Создаем объект Geometry и добавляем фигуры
        Geometry geometry = new Geometry();
        geometry.addFigure(rectangle);
        geometry.addFigure(triangle);
        geometry.addFigure(circle);

        // Выводим информацию о всех фигурах
        geometry.printFigures();

        // Подсчитываем общую площадь
        System.out.println("Total Area of all figures: " + geometry.totalArea());

        // Подсчитываем количество фигур каждого типа
        System.out.println("Number of Rectangles: " + geometry.countFigures(Rectangle.class));
        System.out.println("Number of Triangles: " + geometry.countFigures(Triangle.class));
        System.out.println("Number of Circles: " + geometry.countFigures(Circle.class));

        // Удаляем одну фигуру
        geometry.removeFigure(1); // Удаляем треугольник
        System.out.println("After removal:");
        geometry.printFigures();
    }
}
