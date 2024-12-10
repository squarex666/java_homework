package Java_2;
import java.util.*;

/**
 * Java_2
 * I. Определить одномерный массив и заполнить его случайными значениями от -99 до 99. Вариант 9
 */

public class Print_array {

        public static void main(String[] args) {
            int size = 10;
            int[] array = createRandomArray(size, -99, 99);

            printArray(array, "Исходный массив:");

            double[] reciprocalArray = createReciprocalFraction(array);

            printArray(reciprocalArray, "Массив обратных значений:");

            int[] uniqueIndices = findUniqueElementIndices(array);

            printArray(uniqueIndices, "Индексы элементов, встречающихся один раз:");
        }

        /**
         * @param size размер массива
         * @param min минимальное значение элемента
         * @param max максимальное значение элемента
         * @return массив, заполненный случайными числами
         */
        public static int[] createRandomArray(int size, int min, int max) {
            Random random = new Random();
            int[] array = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = random.nextInt(max - min + 1) + min;
            }
            return array;
        }

        /**
         * @param array исходный массив
         * @return массив с обратными значениями
         */
        public static double[] createReciprocalFraction(int[] array) {
            double[] reciprocalArray = new double[array.length];
            for (int i = 0; i < array.length; i++) {
                try {
                    reciprocalArray[i] = 1.0 / array[i];
                } catch (ArithmeticException e) {
                    System.err.println("Ошибка деления на ноль для элемента с индексом " + i + ": " + array[i]);
                    reciprocalArray[i] = Double.POSITIVE_INFINITY;
                }
            }
            return reciprocalArray;
        }

        /**
         * @param array исходный массив
         * @return массив индексов элементов, встречающихся один раз
         */
        public static int[] findUniqueElementIndices(int[] array) {
            Map<Integer, Integer> frequencyMap = new HashMap<>();
            for (int value : array) {
                frequencyMap.put(value, frequencyMap.getOrDefault(value, 0) + 1);
            }

            List<Integer> indices = new ArrayList<>();
            for (int i = 0; i < array.length; i++) {
                if (frequencyMap.get(array[i]) == 1) {
                    indices.add(i);
                }
            }

            return indices.stream().mapToInt(Integer::intValue).toArray();
        }

        /**
         * @param array массив, который нужно вывести
         * @param message сообщение перед выводом элементов
         */
        public static void printArray(int[] array, String message) {
            System.out.println(message);
            for (int value : array) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        /**
         * @param array массив, который нужно вывести
         * @param message сообщение перед выводом элементов
         */
        public static void printArray(double[] array, String message) {
            System.out.println(message);
            for (double value : array) {
                System.out.printf("%.2f ", value);
            }
            System.out.println();
        }
    }
