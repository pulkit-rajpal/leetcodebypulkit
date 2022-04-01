class Solution {
    public void reverseString(char[] s) {
        char temp;
        int len = s.length - 1;
        for (int i = 0; i < s.length / 2; i++) {
            temp = s[i];
            s[i] = s[len - i];
            s[len - i] = temp;
        }
    }
    }
