class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int i;
        for(i = 0 ; i<nums.length ; i++){
            if(i != nums[i]) {
                return i;
            }
        }
        if(i == nums.length){
            return i ;
        }
        return 0;

    }

}