package Strings_Tasks;

import java.util.Arrays;
import java.util.Collections;

public class FindTheUnique_Solution2 {
    public static void main(String[] args) {
        System.out.println(unique("sssdskjsjskhf"));
    }
    public static String unique(String str) {

        String result ="";

        for(String each : str.split(""))

            result +=(  (Collections.frequency(Arrays.asList(str.split("")), each)) ==1 ) ? each : "";



        return result;

    }
}
