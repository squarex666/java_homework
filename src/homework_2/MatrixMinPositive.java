package homework_2;

/**
 * Java_2
 * IV. Действия над матрицами. Вариант 9
 */

public class MatrixMinPositive {

    public static void main(String[] args) {
        int n = 5;

        int[][] matrix = createRandomMatrix(n, -10, 20);

        printMatrix(matrix, "Исходная матрица:");

        int minPositive = findMinPositiveAboveDiagonal(matrix);

        if (minPositive == Integer.MAX_VALUE) {
            System.out.println("Положительных элементов выше главной диагонали не найдено.");
        } else {
            System.out.println("Минимальный положительный элемент выше главной диагонали: " + minPositive);
        }
    }

    /**
     * @param size размер матрицы (n*n)
     * @param min минимальное значение элемента
     * @param max максимальное значение элемента
     * @return матрица, заполненная случайными числами
     */
    public static int[][] createRandomMatrix(int size, int min, int max) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = (int) (Math.random() * (max - min + 1)) + min;
            }
        }
        return matrix;
    }

    /**
     * @param matrix квадратная матрица
     * @return минимальный положительный элемент выше главной диагонали, или Integer.MAX_VALUE, если таких элементов нет
     */
    public static int findMinPositiveAboveDiagonal(int[][] matrix) {
        int minPositive = Integer.MAX_VALUE;
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (matrix[i][j] > 0 && matrix[i][j] < minPositive) {
                    minPositive = matrix[i][j];
                }
            }
        }

        return minPositive;
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
}