package week4_tasks;

public class FrequencyOfChars {
    public static void main(String[] args) {

        //1. Write a return method that can find the frequency of characters
        //Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

        String str="aagggbbeeeejjjjj";
        String charsAndCounter="";
        int counter=0;

        //First loop to go through each char in str and assigning current letter to check against the rest of str
        for(int i=0;i<str.length();i++) {
            String currentLetter = str.substring(i,i+1);

        //If statement to keep the chars in my return string unique so no chars are listed twice. If it's unique, the char is added to return string
            if (!charsAndCounter.contains(currentLetter)) {
                charsAndCounter += currentLetter;

                //Nested loop and if statement to check the current, unique char against the rest of the string to count how many times it appears
                for (int t = 0; t < str.length(); t++) {
                    if (currentLetter.equals(str.substring(t, t + 1))) {
                        counter++;
                    }
                }
                //After the current letter has been counted through the entire str, then the counter is added to my return string and my counter is reset to 0 for the next char to check
                charsAndCounter += counter+" ";
                counter=0;
            }
        }
        System.out.println(charsAndCounter); //Print return string at the end
    }
}
