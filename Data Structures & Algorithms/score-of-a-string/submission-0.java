class Solution {
    public int scoreOfString(String s) {
        int n = s.length();
        int diff = 0;

        for(int i = 0; i < n - 1; i++) {
            int curr = s.charAt(i);
            int next = s.charAt(i + 1);
            diff += curr > next ? curr - next : next - curr;
        }

        return diff;
    }
}