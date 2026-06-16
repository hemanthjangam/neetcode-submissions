class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int length = 1000001;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while (sum >= target) {
                length = Math.min(length, right - left + 1);
                sum -= nums[left]; left++;
            }
        }

        return length == 1000001 ? 0 : length;
    }
}