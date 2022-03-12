class Solution {
    public boolean isAnagram(String s, String t) {
     
    HashMap<Character, Integer> s1 = new HashMap<>();
        HashMap<Character, Integer> t1 = new HashMap<>();
        for (char c : s.toCharArray()) {
            s1.put(c, s1.getOrDefault(c, 0) + 1);
        }
        for (char c1 : t.toCharArray()) {
            t1.put(c1, t1.getOrDefault(c1, 0) + 1);
        }
        return s1.equals(t1);
    }
}