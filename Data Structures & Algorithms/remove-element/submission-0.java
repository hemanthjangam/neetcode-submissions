class Solution {
    public int removeElement(int[] nums, int val) {
        int n = 0;
        int j = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == val) {
                n++;
            }
            if(nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }

        return nums.length - n;
    }
}