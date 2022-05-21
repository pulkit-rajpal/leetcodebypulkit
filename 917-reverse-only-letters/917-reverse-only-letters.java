import java.util.regex.Pattern;


class Solution {
    public String reverseOnlyLetters(String s) {
        /* The Approach is to run a two poonter one from the start and another from the end 
        apply below cases :
        if not a [a-zA-Z] on first pointer =0   - first pointer ++;
        if not a [a-zA-Z] on Second pointer = length - second pointer --;
        else swap 
        */
        StringBuilder s1 = new StringBuilder(s);
        int l = 0;
        int m = s.length() - 1;
        while (l < m) {
            if (Pattern.matches("[^a-zA-Z]", String.valueOf(s1.charAt(m)))) {
                m--;
            } else if (Pattern.matches("[^a-zA-Z]", String.valueOf(s1.charAt(l)))) {
                l++;
            } //else if (Pattern.matches("[a-zA-Z]", String.valueOf(s1.charAt(l)))) {
            else {
                char temp = s1.charAt(l);
                s1.setCharAt(l, s1.charAt(m));
                s1.setCharAt(m, temp);
                l++;
                m--;
            }
        }   
        return s1.toString();
    }
    
}