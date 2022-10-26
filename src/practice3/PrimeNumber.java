package practice3;

import java.util.Scanner;

public class PrimeNumber {

//    Numbers -- Prime Number
//    Write a method that can check if a number is prime or not.
    //A prime number is a number that is only divisible by 1 and itself.

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int number= input.nextInt();

        if(isPrime(number)) {
            System.out.println(number + " is prime number");
        }
        else{
            System.out.println(number + " is a non-prime number");
        }
    }

    static  boolean isPrime(int num)
    {
        if(num<=1)
        {
            return false;
        }
        for(int i=2;  i<=num/2; i++)
        {
            if((num % i) ==0)
                return  false;
        }
        return true;
    }
}

