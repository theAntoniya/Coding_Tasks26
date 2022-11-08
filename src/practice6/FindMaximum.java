package practice6;

import java.util.Arrays;

public class FindMaximum {
//    3.Array -- Find Maximum
//    Write a method that can find the maximum number from an int Array
static int arr[] = {45, 20, 99988, 6, 25};

         static int maximum()
    {
        int i;

        // Initialize maximum element
        int max = arr[0];

       // compare each element with current max
        for (i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];

        return max;
    }

    public static void main(String[] args)
    {
        System.out.println("Maximum number is " + maximum());
    }
}



