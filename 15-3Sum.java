class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int len = nums.length;
        int target = 0;
        for(int i = 0; i < len; ++i) {
            if(i > 0 && nums[i] == nums[i - 1])
                continue;
            target = -nums[i];
            int j = i + 1;
            int k = len - 1;
            while(j < k) {
                if(nums[j] + nums[k] == target) {
                    List<Integer> l = new ArrayList<>(3);
                    l.add(nums[i]);
                    l.add(nums[j]);
                    l.add(nums[k]);
                    result.add(l);
                    do {
                        --k;
                    } while(j<k&&nums[k]==nums[k+1]);
                    do {
                        ++j;
                    } while(j<k&&nums[j]==nums[j-1]);
                }
                if(nums[j] + nums[k] > target) {
                    do {
                        --k;
                    } while(j<k&&nums[k]==nums[k+1]);
                }
                if(nums[j] + nums[k] < target) {
                    do {
                        ++j;
                    } while(j<k&&nums[j]==nums[j-1]);
                }
            }
        }
        return result;
    }
}