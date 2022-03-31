class Solution {
    public int romanToInt(String s) {
        

        String[] st = s.split("");
        HashMap<String, Integer> map = new HashMap<String, Integer>() {{
            put("I", 1);
            put("V", 5);
            put("X", 10);
            put("L", 50);
            put("C", 100);
            put("D", 500);
            put("M", 1000);
        }};
   int r = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length() && map.get(st[i]) < map.get(st[i + 1])) {
                r = r - map.get(st[i]);
            } else {
                r = r + map.get(st[i]);
            }
        }
        return r;
    }    
}