package practice8;

import java.util.Arrays;

public class ArrayConcatTwoArrays {
    //3.Array -- Concat two arrays
//    Write a return method that can concate two arrays


    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        int length = array1.length + array2.length;

        int[] result = new int[length];
        int concat = 0;
        for (int element : array1) {
            result[concat] = element;
            concat++;
        }

        for (int element : array2) {
            result[concat] = element;
            concat++;
        }




        System.out.println(Arrays.toString(result));
    }
}
