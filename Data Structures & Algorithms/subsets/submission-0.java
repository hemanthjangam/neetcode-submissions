class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        return generate(nums, 0);
    }

    public List<List<Integer>> generate(int[] nums, int index) {
        if (index == nums.length) {
            List<List<Integer>> base = new ArrayList<>();
            base.add(new ArrayList<>());
            return base;
        }

        List<List<Integer>> subsets = generate(nums, index + 1);
        List<List<Integer>> output = new ArrayList<>();

        for (List<Integer> subset : subsets) {
            List<Integer> curr = new ArrayList<>(subset);
            curr.add(nums[index]);
            output.add(curr);
        }

        subsets.addAll(output);

        return subsets;
    }
}
