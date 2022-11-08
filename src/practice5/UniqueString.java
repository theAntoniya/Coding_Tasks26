package practice5;

public class UniqueString {
//    String -- Find the unique
//    Write a return  method that can find the unique characters from the String
//    Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";


    public static void main(String[] args) {
        System.out.println(uniqueString("AAABBBCCCDEF"));
    }
    public static boolean uniqueString(String str) {

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) { // if the count is 1 the character was found one time
                System.out.println(str.charAt(i));
            }
        }
        return false;
    }
}