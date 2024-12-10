package Java_4.fourth_task;

/**
 * Java_4
 * Задания по вариантам. Вариант 9
 */

// Класс Point для представления точки в двумерном пространстве
class Point {
    private double x; // Координата x
    private double y; // Координата y

    // Конструктор для создания точки с координатами x и y
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Геттеры и сеттеры для координат
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

    // Метод для масштабирования координат относительно начала координат
    public void scale(double factor) {
        this.x *= factor; // Масштабируем x
        this.y *= factor; // Масштабируем y
    }

    // Переопределение метода toString для вывода координат точки
    @Override
    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }
}

// Класс Point3D для представления точки в трехмерном пространстве
class Point3D extends Point {
    private double z; // Координата z

    // Конструктор для создания точки с координатами x, y и z
    public Point3D(double x, double y, double z) {
        super(x, y); // Вызов конструктора родительского класса
        this.z = z;
    }

    // Геттер и сеттер для координаты z
    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    // Переопределение метода scale для масштабирования в трехмерном пространстве
    @Override
    public void scale(double factor) {
        super.scale(factor); // Масштабируем x и y через родительский метод
        this.z *= factor; // Масштабируем z
    }

    // Переопределение метода toString для вывода координат точки в трехмерном пространстве
    @Override
    public String toString() {
        return "Point3D(" + getX() + ", " + getY() + ", " + z + ")";
    }
}

// Главный класс для тестирования
public class Main {
    public static void main(String[] args) {
        // Создаем точку 2D с координатами (2.0, 3.0)
        Point point2D = new Point(2.0, 3.0);
        System.out.println("Original 2D point: " + point2D);

        // Масштабируем точку в 2D на коэффициент 2
        point2D.scale(2.0);
        System.out.println("Scaled 2D point: " + point2D);

        // Создаем точку 3D с координатами (2.0, 3.0, 4.0)
        Point3D point3D = new Point3D(2.0, 3.0, 4.0);
        System.out.println("Original 3D point: " + point3D);

        // Масштабируем точку в 3D на коэффициент 2
        point3D.scale(2.0);
        System.out.println("Scaled 3D point: " + point3D);
    }
}
