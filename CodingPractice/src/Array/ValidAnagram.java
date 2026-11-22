package Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public static void main(String [] args) {
        String s = "anagram";
        String t = "nagaram";

        System.out.println(validAnagram(s, t));
    }

    public static boolean validAnagram(String s, String t){
        Map<Character, Integer> map = new HashMap<>();
        if(s.length() != t.length()){
            return false;
        }
        // Count characters in first string
        for (char ch: s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0) + 1);
        }
        // Decrease character counts using second string
        for(char ch: t.toCharArray()){
            if(!map.containsKey(ch)){
                return false;
            }
            map.put(ch, map.get(ch) -1);
            if(map.get(ch) < 0){
                return false;
            }
        }
        return true;
    }
}
