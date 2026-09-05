class Solution {
    public int[] sortArray(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        sort(nums, low, high);
        return nums;
    }

    public void sort(int[] nums, int low, int high) {
        if (low >= high) return;
        int mid = (low + high) / 2;
        sort(nums, low, mid);
        sort(nums, mid + 1, high);
        merge(nums, low, mid, high);
    }

    public void merge(int[] nums, int low, int mid, int high) {
        List<Integer> list = new ArrayList<>();
        int i = low, j = mid + 1;
        
        while (i <= mid && j <= high) {
            if (nums[i] < nums[j]) {
                list.add(nums[i]); i++;
            } else {
                list.add(nums[j]); j++;
            }
        }

        while (i <= mid) {
            list.add(nums[i]); i++;
        }

        while (j <= high) {
            list.add(nums[j]); j++;
        }

        for (i = low; i <= high; i++) {
            nums[i] = list.get(i - low);
        }
    }
}