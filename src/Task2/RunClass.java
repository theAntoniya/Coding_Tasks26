package Task2;

import java.util.ArrayList;
import java.util.Arrays;

public class RunClass {
    public static void main(String[] args) {
        //Swap the numbers
        SwapNumber swap = new SwapNumber();
        swap.swapNum();
        System.out.println("------------------------------------------------------------------------");

        // Divisible 15-3-5
        Divisible15_3_5 div = new Divisible15_3_5();
        div.divisible();
        System.out.println("------------------------------------------------------------------------");

        //Consecutive Numbers
        consecutiveNumber con = new consecutiveNumber();
        con.consecutive(30);

    }
}
