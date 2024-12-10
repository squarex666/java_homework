package Java_1.independent_work;

/**
 * Самостоятельная работа: задание 1
 */

public class Hello_world {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Hello " + args[0]);
        } else {
            System.out.println("Hello world");
        }
    }
}