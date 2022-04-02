class Solution {
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        int count =0;
        boolean flag = false;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return ispal(s,left+1, right) ||  ispal(s,left, right-1); 
            }
            left++;
            right--;
            }
        return true;    
        }
    
    
    public boolean ispal(String s,int left,int right)
    {
            while (left < right ) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
            }
        return true;
    }
}
