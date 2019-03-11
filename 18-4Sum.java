class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int len = nums.length;
        for (int i = 0; i < len - 3; ) {
            for (int j = i + 1; j < len - 2; ) {
                int k = j + 1;
                int l = len - 1;
                while (k < l) {
                    if (nums[i] + nums[j] + nums[k] + nums[l] == target) {
                        List<Integer> list = new ArrayList<>(4);
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        list.add(nums[l]);
                        result.add(list);
                        do {
                            ++k;
                        } while (nums[k]==nums[k - 1] && k < l);
                        do {
                            --l;
                        } while (nums[l]==nums[l + 1] && k < l);
                    }
                    else if (nums[i] + nums[j] + nums[k] + nums[l] < target) {
                        do {
                            ++k;
                        } while (nums[k]==nums[k - 1] && k < l);
                    }
                    else {
                        do {
                            --l;
                        } while (nums[l]==nums[l + 1] && k < l);
                    }
                }
                do {
                    ++j;
                } while (nums[j]==nums[j - 1] && j < len - 2);
            }
            do {
                ++i;
            } while (nums[i]==nums[i - 1] && i < len - 3);
        }
        return result;
    }
}