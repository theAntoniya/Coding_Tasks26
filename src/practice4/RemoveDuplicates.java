package practice4;

public class RemoveDuplicates {
    //    String -- Remove Duplicates
//    Write a return method that can remove the duplicated values from String
//    Ex:  removeDup("AAABBBCCC")  ==> ABC

    public static void main(String[] args) {
        System.out.println(removeDuplicates("AAABBBCCC"));
    }

    public static String  removeDuplicates(String s) {


    String result = "";

    for (int i = 0; i < s.length(); i++){
        if (i + 1 < s.length() && s.charAt(i) != s.charAt(i+1)){
            result = result + s.charAt(i);
        }
        if (i + 1 == s.length()){
            result = result + s.charAt(i);
        }
    }

    return result;

}}