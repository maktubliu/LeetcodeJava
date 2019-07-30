import java.util.HashMap;
import java.util.Map;

class Solution{
    public int[] twoSum(int[] sums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < sums.length; i++){
           map.put(sums[i], i);
        }
        for(int i = 0; i < sums.length; i++){
            int complement = target - sum[i];
            if(map.containsKey(complement) && map.get(complement) != i){
                return new int[]{i, map.get(complement)};
            }
        }
        throw new IllegalArgumentException("no two sums"); 
    }
}