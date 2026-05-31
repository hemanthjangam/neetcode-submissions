class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length(), m = t.length();
        if(n != m) return false;
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++) {
            if(map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 0);
            }
        }

        for(int i = 0; i < m; i++) {
            if(map.containsKey(t.charAt(i))) {
                if(map.get(t.charAt(i)) < 0) return false;
                map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
            } else {
                return false;
            }
        }

        return true;
    }
}
