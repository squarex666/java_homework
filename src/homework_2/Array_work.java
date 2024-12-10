package homework_2;

/**
 * Java_2
 * II. Действия над массивами. Вариант 9
 */

public class Array_work {

    public static void main(String[] args) {
        int[] sourceArray = {0, 5, -3, 0, 2, 0, -1, 4};

        int[] processedArray = processArray(sourceArray);

        selectionSort(processedArray);

        printArray(processedArray, "Отсортированный массив:");
    }

    /**
     * @param sourceArray исходный массив
     * @return массив, содержащий ненулевые элементы, умноженные на 4
     */
    public static int[] processArray(int[] sourceArray) {
        int count = 0;
        for (int value : sourceArray) {
            if (value != 0) {
                count++;
            }
        }

        int[] resultArray = new int[count];
        int index = 0;
        for (int value : sourceArray) {
            if (value != 0) {
                resultArray[index++] = value * 4;
            }
        }

        return resultArray;
    }

    /**
     * @param array массив для сортировки
     */
    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
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
}
