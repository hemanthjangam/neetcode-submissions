class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int longest = 0, start = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (map.containsKey(ch)) {
                start = Math.max(start, map.get(ch) + 1);
            }

            map.put(ch, i);
            longest = Math.max(longest, i - start + 1);
        }

        return longest;
    }
}
