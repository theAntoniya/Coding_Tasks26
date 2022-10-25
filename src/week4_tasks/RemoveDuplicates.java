package week4_tasks;

public class RemoveDuplicates {
    public static void main(String[] args) {

        //3. String -- Remove Duplicates
        //Write a return method that can remove the duplicated values from String
        //Ex:  removeDup("AAABBBCCC")  ==> ABC

        String str="aaabbccccd";
        String returnStr="";

        //For loop with if statement that checks if my return string already contains the current letter. If it doesn't already contain it then it adds the current letter
        for(int i=0;i<str.length();i++){
            if(!returnStr.contains(str.substring(i,i+1))){
                returnStr+=str.substring(i,i+1);
            }
        }
        //Returns str without duplicate letters
        System.out.println(returnStr);


    }
}
