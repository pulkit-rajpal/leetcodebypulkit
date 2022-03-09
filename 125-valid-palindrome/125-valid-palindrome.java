class Solution {
    public boolean isPalindrome(String s) {
           int count = 0;
        char[] arr = s.toLowerCase().replaceAll("[^a-z0-9]", "").toCharArray();
        int len = arr.length - 1;
        boolean flag = true;
        while (count < len) {
            if (arr[count++] != arr[len--]) {
                return false;
            }
        }
        return flag;
    }

}