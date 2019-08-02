class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int l = 0;
        int r = height.length - 1;
        int cur = 0;
        while(l != r){
            cur = Math.min(height[l], height[r]) * (r - l);
            if(cur > max) max = cur;
            if(height[l] > height[r]) r--;
            else l++;
        }
        return max;
    }
}
