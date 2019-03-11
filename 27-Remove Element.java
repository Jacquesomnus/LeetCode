class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int j = nums.length - 1;
        int count = 0;
        while (i <= j) {
            if (nums[i] == val && nums[j] != val) {
                ++count;
                nums[i] = nums[j];
                ++i;
                --j;
            }
            if (nums[i] == val && nums[j] == val) {
                ++count;
                --j;
            }
            if (nums[i] != val) {
                ++i;
            }
        }
        return nums.length - count;
    }
}