public class Task_06 {
    /*
    Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
    если в массиве есть место, в котором сумма левой и правой части массива равны.
    Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
    граница показана символами ||, эти символы в массив не входят.
     */

    //ArraySum
    public static int arraySum(int[] array, int start, int stop) {
        int sum = 0;
        for(int i = start; i < stop; i++) {
            sum += array[i];
        }
        return sum;
    }
    //checkBalance
    public static boolean checkBalance(int[] array) {
        boolean isBalanceExist = Boolean.FALSE;
        int leftSum = 0;
        int rightSum = 0;

        for (int dividerPosition = 1; dividerPosition < array.length; dividerPosition++) {

            leftSum = arraySum(array, 0, dividerPosition);
            rightSum = arraySum(array, dividerPosition, array.length);
            System.out.println(leftSum + " " + rightSum);
            if (leftSum == rightSum) {
                isBalanceExist = Boolean.TRUE;
                System.out.println(true);
                return true;
            }
        }
        System.out.println(false);
        return false;
    }

    //Main
    public static void main(String[] args) {
        int[] testArray = {2, 2, 2, 1, 2, 2, 10, 1};

        boolean test = checkBalance(testArray);

    }
}
