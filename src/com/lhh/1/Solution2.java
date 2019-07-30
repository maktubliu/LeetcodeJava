class Solution{
    int[] twoSum(int[] sums, int target){
        for(int i = 0; i < sums.length; i++){
            for(int j = i + 1; j < sums.length; j++){
                if(i + j == target){
                    return new int[]{j, i};
                }
            }
        }
        throw new IllegalArgumentException("no two sums");
    }
}