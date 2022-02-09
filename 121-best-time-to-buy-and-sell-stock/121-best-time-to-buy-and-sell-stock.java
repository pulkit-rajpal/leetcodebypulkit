class Solution {
    public int maxProfit(int[] prices) {
        
        if (prices.length < 2)
        {
            return 0;
        }
        
        int buyprice = prices[0];
        int res = 0;
        int temp=0;
        for (int i=0;i<prices.length;i++)
        {
            temp  = prices[i]-buyprice;
            if (res < temp)
            {
                res = temp;
            }
            if(prices[i]<buyprice) 
            {
                buyprice=prices[i];
            }
        }
        return res;
        
    }
}