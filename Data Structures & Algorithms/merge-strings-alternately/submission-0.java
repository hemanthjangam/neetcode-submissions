class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int left = 0, right = 0;

        while (left < word1.length() && right < word2.length()) {
            result.append(word1.charAt(left)); left++;
            result.append(word2.charAt(right)); right++;
        }

        if (left < word1.length()) result.append(word1.substring(left));
        if (right < word2.length()) result.append(word2.substring(right));

        return result.toString();
    }
}