class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int maxarea = 0;
        int maxl = height[l];
        int maxr = height[r];
        while(l < r) {
            if(height[l]>=maxl&&height[r]>=maxr) {
                maxarea = Math.max(maxarea, (r - l)* Math.min(height[l], height[r]));
                maxl = height[l];
                maxr = height[r];
            }
            if(height[l]<height[r])
                ++l;
            else
                --r;
        }
        return maxarea;
    }
}