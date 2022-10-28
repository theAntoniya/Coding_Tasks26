package Strings_Tasks;

public class Reverse_Solution2 {
    public static void main(String[] args) {
        System.out.println(reverse("abcd"));
    }
    public  static String  reverse(String str) {

        return new StringBuffer(str).reverse().toString();

    }


}
