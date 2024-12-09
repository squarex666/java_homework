package homework_1.independent_work;

/**
 * Самостоятельная работа: задание 2
 */

public class Count_parameter {
    public static void main(String[] args) {
        // Проверяем, были ли переданы параметры
        if (args.length == 0) {
            System.out.println("Вы не передавали параметров");
        } else {
            System.out.println("Вы ввели " + args.length + " параметров");
        }
    }
}
