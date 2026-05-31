class Solution {
    public int scoreOfString(String s) {
        int n = s.length();
        int diff = 0;

        for(int i = 0; i < n - 1; i++) {
            diff += (Math.abs((int) s.charAt(i) - (int) s.charAt(i + 1)));
        }

        return diff;
    }
}