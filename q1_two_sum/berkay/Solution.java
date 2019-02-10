class Solution {
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        int[] result = new int[2];
        for(int i = 0; i< length ; i++){
            int expected = target - nums[i];
            for (int j = i+1; j < length ; j++){
                if(nums[j] == expected){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}
