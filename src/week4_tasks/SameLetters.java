package week4_tasks;

public class SameLetters {
    public static void main(String[] args) {

        //2. String -- Same letters
        //Write a return method that check if a string is build out of the same letters as another string.
        //Ex:  same("abc",  "cab"); -> true

        String str1="car";
        String str2="arc";
        int counter=0;
        boolean charsAreSame=false;

        //charsAreSame is assigned false to begin with, if the length of the strings are not the same then they can't be made of exactly the same letters so I don't need to check anything else, the program can skip the logic and return false
        if(str1.length()==str2.length()){
            //If the length is the same then this for loop checks if str2 contains each letter. If str2 contains that letter then counter increments by 1
            for(int i=0;i<str1.length();i++){
                if(str2.contains(str1.substring(i,i+1))){
                    counter++;
                }
            }
            //If the counter total is equal to the length of either string then the letters in both strings have to be the same otherwise the counter would not be equal so assigns true only if the strs contain the same letters
            if(counter==str1.length()){
                charsAreSame=true;
            }
        }
        //Return the boolean at the end
        System.out.println(charsAreSame);
    }
}
