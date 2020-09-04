import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Task_02 {
    /*
    2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
     */
    public static final int ARRAY_SIZE = 8;

    public static void main(String[] args) {
        int[] array = new int[ARRAY_SIZE];

        for (int i = 0; i < array.length; i++) {

            array[i] = 3 * i;
        }
        System.out.println(Arrays.toString(array));
    }
}
