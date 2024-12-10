package homework_2;
import java.util.Random;

/**
 * Java_2
 * III. Матрицы. Определить матрицу (двумерный массив) и ее заполнить случайными значениями. Вариант 9
 */

public class Matrix {

    public static void main(String[] args) {
        // Размеры матрицы
        int rows = 5;
        int cols = 6;

        int[][] matrix = createRandomMatrix(rows, cols);

        printMatrix(matrix, "Исходная матрица:");

        int[] vectorB = buildVectorB(matrix);

        printArray(vectorB, "Вектор B:");
    }

    /**
     * @param rows количество строк
     * @param cols количество столбцов
     * @return матрица, заполненная случайными числами
     */
    public static int[][] createRandomMatrix(int rows, int cols) {
        Random random = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(100);
            }
        }
        return matrix;
    }

    /**
     * @param matrix исходная матрица
     * @return вектор B, где B[i] = 1, если i-я строка упорядочена по возрастанию, иначе 0
     */
    public static int[] buildVectorB(int[][] matrix) {
        int[] vectorB = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            vectorB[i] = isRowSorted(matrix[i]) ? 1 : 0;
        }
        return vectorB;
    }

    /**
     * @param row строка матрицы
     * @return true, если строка упорядочена по возрастанию, иначе false
     */
    public static boolean isRowSorted(int[] row) {
        for (int j = 0; j < row.length - 1; j++) {
            if (row[j] > row[j + 1]) {
                return false;
            }
        }
        return true;
    }

    /**
     * @param matrix матрица для вывода
     * @param message сообщение перед выводом
     */
    public static void printMatrix(int[][] matrix, String message) {
        System.out.println(message);
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.printf("%4d", value);
            }
            System.out.println();
        }
    }

    /**
     * @param array массив для вывода
     * @param message сообщение перед выводом
     */
    public static void printArray(int[] array, String message) {
        System.out.println(message);
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}



