class Solution {
    public int subsetXORSum(int[] nums) {
        return xor(nums, 0, 0);
    }

    public int xor(int[] nums, int index, int total) {
        if (index == nums.length) return total;

        return xor(nums, index + 1, total ^ nums[index]) + 
        xor(nums, index + 1, total);
    }
}