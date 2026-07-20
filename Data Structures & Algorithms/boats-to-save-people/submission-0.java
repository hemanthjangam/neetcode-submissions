class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int boats = 0;
        int l = 0, r = people.length - 1;

        while (l <= r) {
            int weight = people[l] + people[r];
            if (weight == limit) {
                boats++; l++; r--;
            } else if (weight >= limit) {
                r--; boats++;
            } else if (weight <= limit) {
                l++; boats++; r--;
            }
        }

        return boats;
    }
}