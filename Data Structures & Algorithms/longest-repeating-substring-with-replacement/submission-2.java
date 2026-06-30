class Solution {
    public int characterReplacement(String s, int k) {
        int max = 0, ans = 0, left = 0;
        int[] freqs = new int[26];

        for (int right = 0; right < s.length(); right++) {
            freqs[s.charAt(right) - 'A']++;
            max = Math.max(max, freqs[s.charAt(right) - 'A']);

            while ((right - left + 1) - max > k) {
                freqs[s.charAt(left) - 'A']--;
                left++;
            }

            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
}
