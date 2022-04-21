class Solution {
    public boolean isHappy(int n) {
        if (n == 1|| n==7) {
            return true;
        }
        if (n <= 9) {
            return false;
        }
        int temp = 0;
        String str = String.valueOf(n);
        String str1[] = str.split("");
        for (int i = 0; i < str1.length; i++) {
            int t = Integer.parseInt(str1[i]);
            temp += t * t;
        }
        return isHappy(temp);
    }
    
}