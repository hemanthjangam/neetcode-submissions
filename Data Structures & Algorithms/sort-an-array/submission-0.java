class Solution {
    public int[] sortArray(int[] nums) {
        int low = 0, high = nums.length - 1;
        mergeSort(low, high, nums);
        return nums;
    }

    public void mergeSort(int low, int high, int[] nums) {
        if(low >= high) return;
        int mid = (low + high) / 2;
        mergeSort(low, mid, nums);
        mergeSort(mid + 1, high, nums);
        merge(low, mid, high, nums);
    }

    public void merge(int low, int mid, int high, int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = low;
        int j = mid + 1;

        while (i <= mid && j <= high) {
            if(nums[i] <= nums[j]) {
                list.add(nums[i]);
                i++;
            } else {
                list.add(nums[j]);
                j++;
            }
        }

        while (i <= mid) {
            list.add(nums[i]);
            i++;
        }

        while (j <= high) {
            list.add(nums[j]);
            j++;
        }

        for(i = low; i <= high; i++) {
            nums[i] = list.get(i - low);
        }

    }
}