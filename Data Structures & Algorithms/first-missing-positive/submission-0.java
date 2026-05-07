class Solution {
    public int firstMissingPositive(int[] nums) {
     int count = 0;
     for(int i=0;i<nums.length;i++){
        if(nums[i] >= 0 ){
            count++;
        }
    }   
     return count;
    }
}