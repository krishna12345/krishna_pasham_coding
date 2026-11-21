package Array;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {

    public static void main(String [] args) {
    int inputArray[] = {1,2,3};
    boolean result= containsDuplicates(inputArray);
    System.out.println(result);
    }

    public static boolean containsDuplicates(int[] inputArray){
        // [1,2,3,1]
        Set<Integer> set = new HashSet<>();
        boolean result = false;
        for(Integer integer : inputArray){
            if(!set.contains(integer)){
                set.add(integer);

            }else{
                return true;
            }
        }
        return result;
    }
}
