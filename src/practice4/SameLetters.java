package practice4;

import java.util.Arrays;

public class SameLetters {
//    String -- Same letters
//    Write a return method that check if a string is build out of the same letters as another string
//    Ex:  same("abc",  "cab"); -> true
//    same("abc",  "abb"); -> false:
/*
    public static void main(String[] args) {
       SameLetters same = new SameLetters();
        System.out.println(same.sameChars("abc", "bna"));
    }
private boolean sameChars(String firstStr, String secondStr) {
    char[] first = firstStr.toCharArray();
    char[] second = secondStr.toCharArray();
    Arrays.sort(first);
    Arrays.sort(second);
    return Arrays.equals(first, second);

 */
public static void main(String[] args) {
    SameLetters same = new SameLetters();
    System.out.println(same.hasSameChar("abc", "bna"));
}
    boolean hasSameChar(String str1, String str2){
        for(char i : str1.toCharArray()){
            if(str2.indexOf(i) < 0 ) return false;
        }
        for(char j : str2.toCharArray()){
            if(str1.indexOf(j) < 0 ) return false;
        }
        return true;
    }
}
