package practice8;

import java.util.Arrays;

public class Array_ZeroToEnd2 {

    public static void main(String[] args) {
//        2.Array -- Move Zeros to the End
//        Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)

        int[] nums = {10, 0, 5, 0, 1, 0};
        int[] fixed = new int[nums.length]; // [ 10, 5 , 1 , 0, 0, 0 ]
        int indexToRead = 0; // read every element from beginning to end  --> same as i in a traditional loop
        int indexToStore = 0; // store values into the fixed array, maybe will not increment each time

        // indexToRead  : 6
        // indexToStore : 3

        while (indexToRead < nums.length) {

            if (nums[indexToRead] != 0) {
                fixed[indexToStore] = nums[indexToRead];
                indexToStore++;
            }

            indexToRead++;
        }
        System.out.println(Arrays.toString(fixed));

    }


}
