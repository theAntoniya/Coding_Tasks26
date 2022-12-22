package practice10;

import java.util.*;

public class MapMethods {
    public static void main(String[] args) {

        //4. Map -- Min value
//    Write a method that can return the minimum value from ta map

        Map<String, String> map = new HashMap<String, String>();
        map.put("3", "908");
        map.put("5", "5555");
        map.put("111", "545");

        String min = Collections.min(map.values());
        System.out.println(min);



    }




//    1.java.util.Map -- Sort the map by values
//    Write a method that can sort the Map by values

    public static Map<String, Integer> sortByValue(Map<String, Integer> map) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());

        map = new LinkedHashMap<>();

        for (Map.Entry<String, Integer> each : list) {
            map.put(each.getKey(), each.getValue());
        }

        return map;

    }


//2.Map -- Frequency of Characters
//    Write a method that prints the frequency of each character from a String

    public static void FrequencyOfCharacters(String str) {

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (Character each : str.toCharArray()) {

            if (map.containsKey(each)) {
                map.put(each, map.get(each) + 1);
            } else {
                map.put(each, 1);
            }

        }

        System.out.println(map);

    }


//3. Map -- Unique character from String
//    Write a method that will return the unique characters from a string

    private static void checkUnique(String input) {
        boolean result = false;
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {
            result = set.add(input.charAt(i));
            if (result == false)
                break;
        }
        System.out.println(result);
    }


}
