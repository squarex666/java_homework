package Java_4.second_task;

/**
 * Java_4
 * Задания по вариантам. Вариант 9
 */

// Класс ComplexNumber для работы с комплексными числами
public class ComplexNumber {
    private double real; // Действительная часть
    private double imaginary; // Мнимая часть

    // Конструктор для создания комплексного числа
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Геттеры и сеттеры для действительной и мнимой части
    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    // Метод для преобразования комплексного числа из полярной формы в алгебраическую
    public static ComplexNumber fromPolar(double r, double theta) {
        double real = r * Math.cos(theta); // Действительная часть
        double imaginary = r * Math.sin(theta); // Мнимая часть
        return new ComplexNumber(real, imaginary);
    }

    // Метод для вывода комплексного числа в алгебраической форме
    @Override
    public String toString() {
        if (imaginary >= 0) {
            return real + " + " + imaginary + "i";
        } else {
            return real + " - " + (-imaginary) + "i";
        }
    }

    // Пример работы с классом ComplexNumber
    public static void main(String[] args) {
        // Пример полярных координат (r, theta)
        double r = 5.0; // Модуль
        double theta = Math.PI / 4; // Аргумент (45 градусов)

        // Преобразуем полярную форму в алгебраическую
        ComplexNumber complexNumber = ComplexNumber.fromPolar(r, theta);

        // Выводим комплексное число
        System.out.println("Complex number in algebraic form: " + complexNumber);
    }
}

