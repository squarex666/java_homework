package Java_1.independent_work;

/**
 * Самостоятельная работа: задание 3
 */

public class Calculate {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Неверное количество параметров");
        } else {
            try {
                int num1 = Integer.parseInt(args[0]);
                int num2 = Integer.parseInt(args[1]);

                int sum = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + sum);
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат данных. Параметры должны быть целыми числами.");
            }
        }
    }
}