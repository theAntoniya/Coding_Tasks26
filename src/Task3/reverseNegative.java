package Task3;

public class reverseNegative {
    public static void main(String[] args) {
        System.out.println("reverseNeg(-153) = " + reverseNeg(-153));
    }

    public static int reverseNeg(int num) {

        int result = 0;
        int lastDigit=0;
        while (num < 0) {

            lastDigit = num % 10;
            result = result * 10 + lastDigit;
            num = num / 10;

        }

      return result;
    }
}
