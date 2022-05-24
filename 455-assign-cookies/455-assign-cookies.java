import java.lang.Math;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        if (g.length ==0 || s.length ==0) return 0;
        /*In Greedy problem we try to solve piece by piece*/
        int count =0,l=0,m=0;
        // here we are runing till our greeds are satisfying and once it satisy we increment 
        // the index for out greed and we keep on incrementing the size index if there is a
        // mismatch
        Arrays.sort(g);
        Arrays.sort(s);
        while(l < g.length && m < s.length)
        {
            if (g[l]<=s[m])
            {
                count++;    
                l++;
            }
            m++;
            
        }
        return count;
    }
}