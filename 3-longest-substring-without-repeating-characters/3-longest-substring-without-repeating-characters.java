class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        if (s.length() == 1) return 1;
        
        //  here int 
        int res = 0;
        int i = 0;
        int j = 0;
        int len = s.length();
        // map to keep the record for the values and keys 
        HashMap<Character, Integer> map = new HashMap<>();
        while (j < len) {
            char s1 = s.charAt(j);
            // if the size of map is grater then window size that add element as we might encouter another unique subarray 
            map.put(s1, map.getOrDefault(s1, 0) + 1);
            // if the size equal the window and there are no repeating chars 
            if (map.size() == j - i + 1) {
                res = Math.max(res, j - i + 1);
            }
            // if the size of the map is less than window size that means we have a element which is not unique or we have got  a element repeating in the map and we have to remove from map till the size become equal to the window size  
            else if (map.size() < j - i + 1) {
                while(map.size() < j - i + 1){  
                char s2 = s.charAt(i);
                // Imnportant is that if the char has ) frequnecy we have to remove that as well 
                map.put(s2, map.getOrDefault(s2, 0) - 1);
                i++;
                if(map.get(s2)==0) {map.remove(s2);}
                }
            }
            j++;
        }
        return res;
                        
        }
        
    }
