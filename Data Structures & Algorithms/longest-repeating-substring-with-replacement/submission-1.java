class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int[] freqs = new int[26];
        int left = 0, max = 0;
        int ans = 0;
        for (int right = 0; right < n; right++) {
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
