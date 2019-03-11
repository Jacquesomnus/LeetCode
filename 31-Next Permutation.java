class Solution {
    private void reverse(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        while(i < j) {
            nums[i] = nums[i] ^ nums[j];
            nums[j] = nums[i] ^ nums[j];
            nums[i] = nums[i] ^ nums[j];
            ++i;
            --j;
        }
    }
    public void nextPermutation(int[] nums) {
        int len = nums.length;
        for (int i = len - 1; i >= 0; --i) {
            for (int j = len - 1; j > i; --j) {
                if (nums[i] < nums[j]) {
                    nums[i] = nums[i] ^ nums[j];
                    nums[j] = nums[i] ^ nums[j];
                    nums[i] = nums[i] ^ nums[j];
                    Arrays.sort(nums, i + 1, len);
                    return ;
                }
            }
        }
        reverse(nums);
    }
}