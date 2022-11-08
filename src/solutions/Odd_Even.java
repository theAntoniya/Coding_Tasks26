package solutions;

public class Odd_Even {
    public static void main(String[] args) {
        System.out.println(oddOrEven(6));
    }
    public static String oddOrEven (int num){
        return num%2==0 ? "Even" :"Odd";
    }
}
