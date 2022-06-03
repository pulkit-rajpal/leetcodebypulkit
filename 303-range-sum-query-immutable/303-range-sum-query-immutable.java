class NumArray {
    public  int[] nums;
    public int[] ps;
    public NumArray(int[] nums) {
        this.nums=new int[nums.length];
        this.ps = new int [nums.length+1];
        this.nums = nums;
        // As we need to find the ranges so we will precomute the sums
        
        for (int i=0;i<nums.length;i++)
         {
             ps[i+1]=ps[i]+nums[i];
             
         }

    }
    
    public int sumRange(int left, int right) {
        // Using the prefix sum 
        // this simply says we need to minus the right sum - left sum as right will contains all the values 
        return ps[right+1]-ps[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */