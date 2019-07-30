/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */
//class Solution {
//    public int[] twoSum(int[] nums, int target) { 
//        Map<Integer, Integer> map = new HashMap<>();
//        for(int i = 0; i < nums.length; i++){
//           map.put(nums[i], i);
//        }
//        for(int i = 0; i < nums.length; i++){
//            int complement = target - nums[i];
//            if(map.containsKey(complement) && map.get(complement) != i){
//                return new int[]{i, map.get(complement)};
//            }
//        }
//        throw new IllegalArgumentException("no two sums"); 
//    }
//}
class Solution{
    int[] twoSum(int[] sums, int target){
        for(int i = 0; i < sums.length; i++){
            for(int j = i + 1; j < sums.length; j++){
                if(sums[i] + sums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("no two sums");
    }
}
