package Week2;

import java.util.ArrayList;
import java.util.Arrays;

public class T1_Swap {
    public static void swapInt(int num1,int num2 ){
        System.out.println("Before: num1 = " + num1 + " num2 = " + num2);

        num1 = num1 + num2; //num1 = 10+11 = 21;  num1=21; num2=11;
        num2 = num1 - num2; //num2 = 21-11 = 10;  num1=21; num2=10;
        num1 = num1 - num2; //num1 = 21-10 = 11;  num1=11; num2=10
        System.out.println("---------------------------------");


        System.out.println("After: num1 = " + num1 + " num2 = " + num2);
    }
    public static void swapString(String str1,String str2 ){
        String s1 = "Wooden";
        String s2 = "Spoon";
        System.out.println("Before: s1: " + s1 + " s2: " + s2);
        s1 = s1 + s2;                                              //  s1=WoodenSpoon
        s2 = s1.replaceAll(s2, "");                    //   s2=WoodenSpoon-Spoon=Wooden
        s1 = s1.replaceAll(s2, "");                   //   s1 = WoodenSpoon - Wooden =Spoon
        System.out.println("----------------------------------");

        System.out.println("After: s1: " + s1 + " s2: " + s2);
    }

    public static void main(String[] args) {
    swapString("wooden", "spoon");
    }

}
