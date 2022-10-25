package week3_tasks;

public class ReverseNegNumbers {
    public static void main(String[] args) {

        Integer num=-123;
        String str=num.toString();
        String strReversed="-";

        for(int i=str.length()-1;i>=1;i--){
            strReversed+=str.charAt(i);
        }
       Integer reversedNum=Integer.parseInt(strReversed);
        System.out.println(reversedNum);
    }
}
