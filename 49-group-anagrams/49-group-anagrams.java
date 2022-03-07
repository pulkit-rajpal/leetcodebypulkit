class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        ArrayList<String> strList = new ArrayList<>();
        HashMap<HashMap<Character, Integer>, ArrayList<String>> finalmap = new HashMap<>();
        for (String str : strs) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
            if (!finalmap.containsKey(map)) {
                ArrayList<String> array = new ArrayList<>();
                array.add(str);
                finalmap.put(map, array);
            } else {
                ArrayList<String> array = finalmap.get(map);
                array.add(str);
            }
        }
        return new ArrayList<>(finalmap.values());
    }
}