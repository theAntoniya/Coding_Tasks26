package Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class RunTheMethods {
    public static void main(String[] args) {


       //Odd or Even
        OddOrEven odEven = new OddOrEven();
        String  str = odEven.CheckOddOrEven(12);
        System.out.println(str);


        //FinRa

        FinRa finra = new FinRa();
          ArrayList<Object> list = finra.frinRa(30);
        System.out.println(list);

        //Divide without / operator

        divideWithoutOperator divide = new divideWithoutOperator();
       String result =  divide.divide(-30,15);
        System.out.println(result);


    }
}
