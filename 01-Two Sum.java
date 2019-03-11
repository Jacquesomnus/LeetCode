class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int len=nums.length;
        int[] ans=new int[2];
        for(int i=0;i<len;++i)
        {
            if(map.containsKey(nums[i]))
            {
                ans[0]=map.get(nums[i]);
                ans[1]=i;
                break;
            }
            else
            {
                map.put(target-nums[i],i);
            }
        }
        return ans;
    }
}