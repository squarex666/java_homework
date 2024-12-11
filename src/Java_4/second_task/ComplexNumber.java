package Java_4.second_task;

/**
 * Java_4
 * Задания по вариантам. Вариант 9
 */

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

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

    public static ComplexNumber fromPolar(double r, double theta) {
        double real = r * Math.cos(theta);
        double imaginary = r * Math.sin(theta);
        return new ComplexNumber(real, imaginary);
    }

    @Override
    public String toString() {
        if (imaginary >= 0) {
            return real + " + " + imaginary + "i";
        } else {
            return real + " - " + (-imaginary) + "i";
        }
    }

    public static void main(String[] args) {
        double r = 5.0;
        double theta = Math.PI / 4;

        ComplexNumber complexNumber = ComplexNumber.fromPolar(r, theta);

        System.out.println("Complex number in algebraic form: " + complexNumber);
    }
}

