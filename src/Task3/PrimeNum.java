package Task3;

public class PrimeNum {

    public static void main(String[] args) {
        System.out.println(isItPrime(31));
    }

    public static boolean isItPrime(int num) {

        boolean isPrime = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }
}
