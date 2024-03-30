import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {


    public static void main(String[] args) {
       int[] test = {3,3};
       int[] res= twoSum(test,6);
            System.out.println(res[0]+"\t"+res[1]);

    }

    public static int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];
        Map<Integer, Integer> temp = new HashMap<>();
        for (int i = 0; i <nums.length ; i++) {
            int diff  = target-nums[i];
            if(temp.containsKey(diff)){
                result[0]=temp.get(diff);
                result[1]=i;
                return result;
            }else{
                temp.put(nums[i],i);
            }
        }

        return result;
    }

}
