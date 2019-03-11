class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] index = new int[128];
        int ans = 0;
        for (int i = 0, j = 0; j < s.length(); ++j) {
            i = Math.max(index[s.charAt(j)], i);
            index[s.charAt(j)] = j + 1;
            ans = Math.max(ans, j - i + 1);
        }
        return ans;
    }
}