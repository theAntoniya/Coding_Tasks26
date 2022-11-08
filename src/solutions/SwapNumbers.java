package solutions;

import java.util.Scanner;

public class SwapNumbers {
     /*
     Numbers -- Swap Numbers
Swap two variable' values without using a third variable
     */

    public static void main(String a[]) {
        System.out.println("Enter two numbers:");
        Scanner num = new Scanner(System.in);

        int x = num.nextInt();
        int y = num.nextInt();
        System.out.println("before swapping numbers: "+x +" "+ y);

        x = x + y;
        y = x - y;
        x = x - y;System.out.println("After swapping: "+x +"  " + y);
    }
}
