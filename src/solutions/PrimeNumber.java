package solutions;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(primeNumber(5));
        System.out.println(primeNumber(4));
    }
    public static boolean primeNumber(int num) {

        if(num <= 1){
            return false;
        }

        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                return false;
            }
        }

        return true;

    }
}
