import java.util.Arrays;

public class Task_07 {

    /*
    7. **** Написать метод, которому на вход подается одномерный массив и число n
    (может быть положительным, или отрицательным), при этом метод должен сместить все элементымассива на n позиций.
    Для усложнения задачи нельзя пользоваться вспомогательными массивами.
     */

    public static int loop(int n, int max) {

        int factor = n / max;
        if (n >= max) {
            n = n - (factor*max);
            return n;
        }
        return n;
    }

    public static int[] shift(int[] array, int n) {
        int temp;

        if (n >= 0) {
            n = loop(n, array.length);

            for (int i = 0; i < n; i++) {
                temp = array[array.length - 1];
                for (int j = array.length - 1; j > 0; j--) {
                    array[j] = array[j - 1];
                }
                array[0] = temp;
            }
            return array;
        }
        else {

            n = -(loop(n, array.length));
            System.out.println(n);
            for (int i = 0; i < n; i++) {
                temp = array[0];
                for (int j = 0; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = temp;
            }
            return array;
        }
    }

    public static void main(String[] args) {
        int[] testArray = {1, 2, 3, 4};
        System.out.println(Arrays.toString(shift(testArray, -41)));

    }

}
