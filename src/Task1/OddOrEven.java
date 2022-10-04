package Task1;

public class OddOrEven {

   /* 1. Numbers -- odd & even
    Write  a method which can identifies given number is even or odd*/

    public String CheckOddOrEven(int num){
     if(num!=0){
        if(num %2==0){
            return num + " is Even";
        }else {
            return num +" is Odd ";
        }}
     else {
         return "please enter a number except Zero(0)";
     }
    }







}
