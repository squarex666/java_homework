package Java_1;
import java.util.Scanner;

/**
 * Java_1
 * Задания по вариантам: Логические ветвления, вариант 9
 */

public class Logical_branches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение x: ");
        double x = scanner.nextDouble();

        double Y;
        if (x <= -2) {
            Y = Math.pow(x, 5) - Math.tan(2 * x - 1);
        } else if (x > -2 && x <= 1) {
            Y = 3 * x / (1 + Math.exp(x));
        } else {
            Y = Math.pow(Math.sin(x), 5);
        }

        double F;
        if (x <= -2) {
            F = Math.exp(Math.sin(x));
        } else if (x > -2 && x <= 1) {
            F = Math.pow(x, 2) / Math.sqrt(Math.cos(x));
        } else {
            F = Math.sqrt(Math.cos(x));
        }

        System.out.println("Результат Y: " + Y);
        System.out.println("Результат F: " + F);

        scanner.close();
    }
}