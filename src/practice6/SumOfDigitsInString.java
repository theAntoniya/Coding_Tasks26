package practice6;

public class SumOfDigitsInString {
//    2.String -- sum of digits in a string
//    Write a method that can return the sum of the digits in a string

    public static void main(String[] args) {
        DigittoString("djgdlgjdl32jldjkgdgj");

    }

    public static String DigittoString(String str) {
//       We take String
//       Convert it into array of characters
//        Then we use for loop till length of char array
//        Using isDigit() method we check the digits in string.
//        And when isDigit() will return true  print that index value.
//        That digit is in char form. We will convert it into String then Integer.
//        And then we sum it.

        //   String s = "abhicdhelhil19ofrhiidayhi";

        char[] str1 = str.toCharArray();
        int sum = 0;
        for (int i = 0; i < str1.length; i++) {
            if (Character.isDigit(str1[i])) {
                System.out.print("Digits in the String : " + str1[i]);
                System.out.println();
                int a = Integer.parseInt(String.valueOf(str1[i]));
                sum = sum + a;
            }
        }
        System.out.println("Digits sum is : " + sum);


        return str;
    }
}



