package homework_1;
import java.util.Scanner;

/**
 * Java_1
 * Задания по вариантам: Сложные математические функции., вариант 9
 */

public class Complex_mathematical_functions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение a: ");
        double a = scanner.nextDouble();

        System.out.print("Введите значение b: ");
        double b = scanner.nextDouble();

        double max = Math.max(a, b);
        double min = Math.min(a, b);

        double numerator = min - 2 * Math.sqrt(max);
        double denominator = 1 + (max / min);
        double d = numerator / denominator;

        System.out.println("Результат d: " + d);

        scanner.close();
    }
}


