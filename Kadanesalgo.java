class Solution{
    public int maxSubArray(int[] nums) {
        int max=0;
        int sum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max+=nums[i];
         sum=Math.max(sum,max);
         if(max<0){
            max=0;
         }
        }
        return sum;
    }
}
