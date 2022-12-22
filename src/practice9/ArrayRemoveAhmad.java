package practice9;

import java.security.Security;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayRemoveAhmad {


//    Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
//    Write a java operation to remove all the names named Ahmed

    //solution 1
    public static void main(String[] args) {

    ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
    names.removeAll(Arrays.asList("Ahmed"));
    System.out.println(names);

    }


    // solution 2
    public static List<String> removeName1(List<String> names) {
        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            if (it.next().equals("Ahmed"))
                it.remove();
        }
        return names;
    }


    // solution 3
    public static List<String> removeName2(List<String> names) {
        names.removeIf(name -> name.equals("Ahmed"));
        return names;
    }


}



