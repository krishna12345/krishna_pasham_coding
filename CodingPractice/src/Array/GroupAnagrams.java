package Array;

import java.util.*;

public class GroupAnagrams {

    public static void main(String args []){
    String[] strings = {"eat","tea","tan","ate","nat","bat"};
    System.out.println(groupAnagrams(strings));
    }

    public static List<List<String>> groupAnagrams(String arr[]){
        Map<String, List<String>> map = new HashMap<>();

        for(String str : arr){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
