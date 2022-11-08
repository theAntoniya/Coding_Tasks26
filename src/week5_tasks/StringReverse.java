package week5_tasks;

public class StringReverse {
    //String -- Reverse
    //Write a return method that can reverse  String
    //Ex: Reverse("ABCD"); ==> DCBA

    public static void main(String[] args) {

        String str="abcdef";
        String revStr="";
        for(int i=str.length()-1;i>=0;i--){
            revStr+=str.charAt(i);
        }
        System.out.println(revStr);

    }
}
