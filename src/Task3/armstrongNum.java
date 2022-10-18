package Task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class armstrongNum {
    public static void main(String[] args) {
        System.out.println("armStrong(1634) = " + armStrong(1634));

    }

    public static boolean armStrong(int num) {


        String[] str = String.valueOf(num).split("");
        int result = 0;

        for (String each : str) {
            result += Math.pow((Integer.parseInt(each)),str.length);
        }
        return result==num;
    }
}
