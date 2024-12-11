package Java_1.independent_work;

/**
 * Самостоятельная работа: задание 4
 */

public class Login_check {
    public static void main(String[] args) {
        String correctUsername = "username";
        String correctPassword = "password";

        if (args.length != 2) {
            System.out.println("Неверное количество параметров. Требуется два параметра: имя пользователя и пароль.");
            return;
        }

        String enteredUsername = args[0];
        String enteredPassword = args[1];

        if (enteredUsername.equals(correctUsername) && enteredPassword.equals(correctPassword)) {
            System.out.println("Вас узнали. Добро пожаловать");
        } else {
            System.out.println("Логин и пароль не распознаны. Доступ запрещен");
        }
    }
}