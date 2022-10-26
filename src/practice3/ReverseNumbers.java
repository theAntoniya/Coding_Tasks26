package practice3;

public class ReverseNumbers {

//    Numbers -- Reverse negative number
//    Write a return method that can reverse negative number and return it as int.
//public static void main(String[] args) {
//    reverseInteger(5624);
//}
//
//    public static int reverseInteger(int number) {
//        boolean isNegative = number < 0 ? true : false;
//        if (isNegative) {
//            number = number * -1;
//
//        }
//
//    return number;
public static void main(String[] args) {
    System.out.println("reverseNum() = " + reverseNum(14732));
}

    public static int reverseNum(int  num) {

        String str = new StringBuilder(""+num).reverse().toString();

        if(num < 0) {

            str = "-"+str.substring(0, str.length()-1);

        }

        return Integer.valueOf(str);

    }
}

