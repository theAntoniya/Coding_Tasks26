package Week1;

public class OddEven {
    public static void oddOrEven(int num1){
        if (num1<=0){
            throw new RuntimeException("Incorrect number. Only positive numbers allowed");
        }
        String result = "";
        if (num1%2==0){
            result="Even";
        } else if (num1%2!=0) {
            result="Odd";
        }
        System.out.println(result+" number entered. Your number is: "+num1);

    }

    public static void main(String[] args) {
        oddOrEven(13);
    }
}
