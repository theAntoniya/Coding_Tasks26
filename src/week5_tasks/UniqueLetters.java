package week5_tasks;

public class UniqueLetters {
    //String -- Find the unique
    //Write a return  method that can find the unique characters from the String
    //Ex:  unique("AAABBBBCCCDEF")  ==>  "DEF";

    public static void main(String[] args) {

        String str="AABACABDCAEBCF";
        String returnStr="";

        for(int i=0;i<str.length();i++){
            int count=0;
            String currentLetter=""+str.charAt(i);

            for(int t=0;t<str.length();t++){
                if(str.substring(t,t+1).equals(currentLetter)){
                    count++;
                }
            }if(count<2){
                returnStr+=currentLetter;
            }
        }
        System.out.println(returnStr);

    }
}
