class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        int m = s.length(), n = t.length();
        if(m != n) return false;

        for(int i = 0; i < m; i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for(int j = 0; j < n; j++) {
            map.put(t.charAt(j), map.getOrDefault(t.charAt(j), -1) -1);
            if(map.get(t.charAt(j)) < 0) {
                return false;
            }
        }

        return true;
    }
}
