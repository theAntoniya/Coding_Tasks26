package Task2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SwapNumber {
  /*  Swap Numbers
    Swap two variable's values without using a third variable*/

    public void swapNum(){
        int num1= 15;
        int num2= 10;


        System.out.println( "Before swap : \n" +  num1 +"\n"+ num2 );


        num1 = num1+num2;   //num1 =  15 + 10  --> 25
        num2 = num1-num2;   // num2 = 25 - 10 --> 15 so we competed our first step
        num1 = num1-num2;


        System.out.println( "After swap : \n" +  num1 +"\n"+ num2 );



    }


}
