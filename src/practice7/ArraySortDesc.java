package practice7;

import java.util.Arrays;

public class ArraySortDesc {
//    Array -- Sort Descending
//    Write a return method that can sort an int array in descending order without using the sort method of the Arrays
//    class
//    Ex:  int[] arr = {10,20,7, 8, 90};
//    arr = Sort(arr);  ==>  {90, 20, 10, 8, 7};

    public static void main(String[] args)
    {
        int temp;
//initializing an array
        int a[]={12,5,56,-2,32,2,-26,9,43,94,-78};
        for (int i = 0; i < a.length; i++)
        {
            for (int j = i + 1; j < a.length; j++)
            {
                if (a[i] < a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Array elements in descending order:");
//accessing element of the array
        for (int i = 0; i <=a.length - 1; i++)
        {
            System.out.println(a[i]);
        }
    }
}

