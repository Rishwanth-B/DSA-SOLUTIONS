class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlen=0;
        int left=0;
        Map<Character,Integer> mpp=new HashMap<>();
        for(int right=0;right<s.length();right++){
            char c=s.charAt(right);
             if(mpp.containsKey(c)&& mpp.get(c)>=left){
               left=mpp.get(c)+1;
             }
             mpp.put(c,right);

             maxlen=Math.max(right-left+1,maxlen);
        }
        return maxlen;
    }
}
