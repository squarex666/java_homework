package homework_1.independent_work;

/**
 * Самостоятельная работа: задание 3
 */

public class Login_check {
    public static void main(String[] args) {
        // Заданные значения для имени пользователя и пароля
        String correctUsername = "username";
        String correctPassword = "password";

        // Проверяем, если передано два параметра
        if (args.length != 2) {
            System.out.println("Неверное количество параметров. Требуется два параметра: имя пользователя и пароль.");
            return;
        }

        // Получаем имя пользователя и пароль из аргументов командной строки
        String enteredUsername = args[0];
        String enteredPassword = args[1];

        // Проверяем соответствие введенных значений с заданными
        if (enteredUsername.equals(correctUsername) && enteredPassword.equals(correctPassword)) {
            System.out.println("Вас узнали. Добро пожаловать");
        } else {
            System.out.println("Логин и пароль не распознаны. Доступ запрещен");
        }
    }
}