package Week1;

public class Divide {
    public static void division (int num1, int num2) throws InterruptedException {
        if (num2 == 0) {
     throw new RuntimeException("You can't divide by zero");
        }
        int div = 0;

        while (num1 >= num2) {
            num1 -= num2;
            div++;
        }
        System.out.println("Answer: "+div + " remainder is " + num1);
        Thread.sleep(3000);


    }

    public static void main(String[] args) throws InterruptedException {

        division(25,5);
    }


}
