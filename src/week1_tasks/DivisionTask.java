package week1_tasks;

public class DivisionTask {
    public static void main(String[] args) {


        int num1 = 2;
        int num2 = 5;
        int numHolder1 = Math.abs(num1);
        int numHolder2 = Math.abs(num2);
        int counter = 0;


        if (num2 > num1) {
            System.out.println(0);
        } else {

            do {
                numHolder1 = numHolder1 - numHolder2;
                counter++;
            } while (numHolder1 >= numHolder2);


            if (num1 < 0 || num2 < 0) {
                counter = -counter;
            }

            System.out.println(counter);

        }
    }
}
