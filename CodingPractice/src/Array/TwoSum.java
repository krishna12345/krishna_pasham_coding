package Array;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
*
Create a HashMap.
Iterate through the array.
Calculate the complement: target - nums[i].
Check whether the complement exists in the HashMap.
If found, return both indices.
Otherwise, store the current number and its index.
* */
public class TwoSum{

    public static void main(String [] args){
    int inputArray[] = {3,2,4};
    int target = 6;
    int result[] = twoSum(inputArray, target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] inputArray, int target){
        Map<Integer, Integer> map = new HashMap<>();
        // [2,7,11,15]
        for(int i = 0; i< inputArray.length; i++) {
            int complement = target - inputArray[i];

            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }
            map.put(inputArray[i], i);
        }
        return new int[]{};
    }
}