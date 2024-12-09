package homework_1;

/**
 * Java_1
 * Задания по вариантам: Переменные, вариант 9
 */

public class Variables {
    public static void main(String[] args) {
        // Проверяем, что передано два параметра
        if (args.length != 2) {
            System.out.println("Неверное количество параметров. Требуется два параметра: два числа.");
            return;
        }

        try {
            // Преобразуем параметры в числа
            double a = Double.parseDouble(args[0]);
            double b = Double.parseDouble(args[1]);

            // Проверяем условие произведения чисел
            if (a * b > 20) {
                // Если произведение больше 20, вычисляем котангенс второго числа
                double cotangent = 1 / Math.tan(b);  // котангенс = 1 / тангенс
                System.out.println("Котангенс второго числа: " + cotangent);
            } else {
                // Иначе первое число делим на 3
                double result = a / 3;
                System.out.println("Результат деления первого числа на 3: " + result);
            }
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: введены некорректные числа.");
        }
    }
}