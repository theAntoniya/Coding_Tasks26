package Week2;

import java.util.ArrayList;
import java.util.Arrays;

public class T2_Divisible {
    public static void main(String[] args) {
        ArrayList<Integer> divisibleBy15 = new ArrayList<>();
        ArrayList<Integer> divisibleBy3 = new ArrayList<>();
        ArrayList<Integer> divisibleBy5 = new ArrayList<>();

        for (int i = 1; i <=100; i++) {
            if (i%15==0){
                divisibleBy15.add(i);
            }
            if (i%3==0&&i%15!=0){
                divisibleBy3.add(i);
            }
            if (i%5==0&&i%15!=0){
                divisibleBy5.add(i);
            }
        }
        System.out.println("Divisible by 15: "+divisibleBy15);
        System.out.println("Divisible by 3: "+divisibleBy3);
        System.out.println("Divisible by 3: "+divisibleBy5);

    }
}
