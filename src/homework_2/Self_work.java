package homework_2;
import java.util.Arrays;
import java.util.Random;

/**
 * Java_2
 * Самостоятельная работа:
 */

public class Self_work {

    public static void main(String[] args) {
        int size = 30;
        int min = 100;
        int max = 200;

        int[] vector = fillRandomIntVector(size, min, max);

        printVector(vector, "Исходный вектор:");

        Arrays.sort(vector);

        printVector(vector, "Отсортированный вектор:");
    }

    /**
     * @param size размер вектора
     * @param min минимальное значение элемента
     * @param max максимальное значение элемента
     * @return вектор, заполненный случайными числами
     */
    public static int[] fillRandomIntVector(int size, int min, int max) {
        Random random = new Random();
        int[] vector = new int[size];
        for (int i = 0; i < size; i++) {
            vector[i] = random.nextInt(max - min + 1) + min;
        }
        return vector;
    }

    /**
     * @param vector вектор, который нужно вывести
     * @param message сообщение перед выводом элементов
     */
    public static void printVector(int[] vector, String message) {
        System.out.println(message);
        for (int value : vector) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}