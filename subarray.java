class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
       return saver(nums,k)-saver(nums,k-1);
    }
    public int saver(int[]nums,int z){
        int left=0; int count=0;
        Map<Integer,Integer> mpp=new HashMap<>();
        for(int right=0;right<nums.length;right++){
            mpp.put(nums[right],mpp.getOrDefault(nums[right],0)+1);
            while(mpp.size()>z){
              mpp.put(nums[left],mpp.get(nums[left])-1);
              if(mpp.get(nums[left])==0){
                mpp.remove(nums[left]);
              }
              left++;
            }
            if(mpp.size()<=z){
             count+=right-left+1;
            }
        }
        return count;
    }
}