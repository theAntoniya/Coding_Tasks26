package solutions;

import java.util.Arrays;

public class AlphaNumericString {
    public static void main(String[] args) {
        sortLettersAndNumbersFromString("DC501GCCCA098911");
    }
    public static void sortLettersAndNumbersFromString(String str) {

        StringBuilder str2 = new StringBuilder();

        for(int i = 0; i < str.length(); i++) {

            str2.append("").append(str.charAt(i));

            if(Character.isAlphabetic(str.charAt(i)) && i < str.length()-1 ) {

                if(Character.isDigit(str.charAt(i+1)) ) {

                    str2.append(",");
                }
            }

            if(Character.isDigit(str.charAt(i)) && i < str.length()-1) {

                if(Character.isAlphabetic(str.charAt(i+1))) {

                    str2.append(",");

                }

            }

        }

        String[] arr = str2.toString().split(",");

        str ="";

        for(String each: arr) {

            char[] chars=each.toCharArray();

            Arrays.sort(chars);

            for(char eachChar: chars){

                str +=""+eachChar;

            }

        }

        System.out.println(str);

    }
}
