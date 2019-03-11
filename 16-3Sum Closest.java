class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int len = nums.length;
        int min = 10000;
        int res = 0;
        for (int i = 0; i < len; ++i) {
            int j = i + 1;
            int k = len - 1;
            while (j < k) {
                if (nums[i] + nums[j] + nums[k] == target) {
                    return target;
                }
                if (nums[i] + nums[j] + nums[k] < target) {
                    if(Math.abs(nums[i] + nums[j] + nums[k] - target) < min) {
                        min = Math.abs(nums[i] + nums[j] + nums[k] - target);
                        res = nums[i] + nums[j] + nums[k];
                    }
                    do {
                        ++j;
                    } while(j < k && nums[j] == nums[j-1]);
                }
                else if (nums[i] + nums[j] + nums[k] > target) {
                    if(Math.abs(nums[i] + nums[j] + nums[k] - target) < min) {
                        min = Math.abs(nums[i] + nums[j] + nums[k] - target);
                        res = nums[i] + nums[j] + nums[k];

                    }
                    do {
                        --k;
                    } while(j < k && nums[k] == nums[k+1]);
                }
            }
        }
        return res;
    }
}