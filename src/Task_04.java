import java.util.Arrays;

public class Task_04 {
    /*
    4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
     */
    public static final int ARRAY_SIZE = 32;

    public static void main(String[] args) {
        int[][] array = new int[ARRAY_SIZE][ARRAY_SIZE];
        for (int i = 0; i < ARRAY_SIZE; i++) {
            for (int j = 0; j < ARRAY_SIZE; j++) {
                if (i==j) {
                    array[i][j] = 1;
                }
                System.out.print(array[i][j]);
            }
            System.out.println("\t");
        }
    }
}
