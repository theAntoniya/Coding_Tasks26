package practice4;

public class FrequencyOfCharacters {

//    Write a return method that can find the frequency of characters
//    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2


    public static void main(String[] args) {
        System.out.println(frequencyOfChar("AAABBCDD", 'A'));
    }

    public static int frequencyOfChar(String str, char letter){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == letter){
                count++;
            }
        }
        return count;
    }
}

