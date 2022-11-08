package practice6;

import java.util.Scanner;

public class ValidPassword {
//    String -- Password Validation Task
//1. Write a return method that can verify if a password is valid or not.
//    requirements:
//    1. Password MUST be at least have 6 characters and should not contain space
//2. PassWord should at least contain one upper case letter
//3. PassWord should at least contain one lowercase letter
//4. Password should at least contain one special characters
//5. Password should at least contain a digit
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a Password: ");
        String password = input.next();
        if (isValid(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }

    public static boolean isValid(String password) {
        //return true  if password:

        if (password.length() <= 6  && !password.contains(" ") && (!password.contains("@") || !password.contains("#"))) {
            return false;
        } else {
            char c;
            int count = 1;
            for (int i = 0; i < password.length() - 1; i++) {
                c = password.charAt(i);
                if  (Character.isDigit(c) && Character.isUpperCase(c) && Character.isLowerCase(c)) {
                    count++;
                    if (count < 1)   {
                        return false;
                    }

                    }
                }
            }
         return true;
    }
}

