package homework_1.independent_work;

/**
 * Самостоятельная работа: задание 3
 */

public class Calculate {
    public static void main(String[] args) {
        // Проверяем, если количество параметров не равно 2
        if (args.length != 2) {
            System.out.println("Неверное количество параметров");
        } else {
            try {
                // Преобразуем переданные параметры в целые числа
                int num1 = Integer.parseInt(args[0]);
                int num2 = Integer.parseInt(args[1]);

                // Выводим значения и их сумму
                int sum = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + sum);
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат данных. Параметры должны быть целыми числами.");
            }
        }
    }
}