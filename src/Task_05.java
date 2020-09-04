import java.util.Arrays;

public class Task_05 {
    /*
    5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
     */

    public static int arrayMin(int[] array) {
        int min = array[0];
        for(int i = 0; i < array.length; i++) {
            if (array[i] < min ){
                min = array[i];
            }
        }
        return min;
    }
    public static int arrayMax(int[] array) {
        int max = array[0];
        for(int i = 0; i < array.length; i++) {
            if (array[i] > max ){
                max = array[i];
            }
        }
        return max;
    }


    public static final int ARRAY_SIZE = 15;
    public static void main(String[] args) {
        int[] array = new int[ARRAY_SIZE];

        //Filling Array
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (100 * Math.random());
        }
        System.out.println(Arrays.toString(array));

        System.out.println("Minimum: " + arrayMin(array));
        System.out.println("Maximum: " + arrayMax(array));

    }
}
