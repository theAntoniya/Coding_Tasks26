package Task1;

public class divideWithoutOperator {

       /*2.Numbers -- Divide without / operator
    Write a method that can divide two numbers without using division operator.*/

    public String divide(int num1, int num2) {
        int count = 0;

            while (num1 >= num2) {
                num1 = num1 - num2;
                count++;
            }


            return "result " + count + " left -> " + num1;
        }
    }


