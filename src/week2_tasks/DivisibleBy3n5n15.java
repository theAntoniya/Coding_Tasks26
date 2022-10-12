package week2_tasks;

public class DivisibleBy3n5n15 {
    public static void main(String[] args) {

        //2. Numbers -- Divisible by 3, 5, 15
        //Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.
        //if the number can be divisible by 3, 5 and 15, then it should only be displayed in DivisibelBy15' section
        //if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibelBy3' section
        //if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibelBy5' section

        String divBy15="";
        String divBy3="";
        String divBy5="";
        for(int i=1;i<=100;i++){
            if(i%15==0){
                divBy15+=String.valueOf(i)+", ";

            }else if(i%3==0){
                divBy3+=String.valueOf(i)+", ";

            }else if(i%5==0){
                divBy5+=String.valueOf(i)+", ";
            }
        }
        System.out.println("Divisible by 15: "+divBy15+"\nDivisible by 3: "+divBy3+"\nDivisible by 5: "+divBy5);





    }
}
