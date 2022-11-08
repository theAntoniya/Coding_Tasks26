package solutions;

public class Reverse_Solution1 {
    public static void main(String[] args) {
        System.out.println(strReverse("ABCD"));
    }
    public static String strReverse(String str) {

        String reverse="";

        for(int i=str.length()-1; i >= 0; i--)

            reverse += str.toCharArray()[i];



        return  reverse;

    }
}
