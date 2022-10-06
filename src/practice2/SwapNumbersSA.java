package practice2;

public class SwapNumbersSA {
    /*
    Swap two variable' values without using a third variable
     */
    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 9;
        System.out.println("num2 = " + num2 + ", num1 = " + num1);

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("num2 = " + num2 + ", num1 = " + num1);

    }



}
