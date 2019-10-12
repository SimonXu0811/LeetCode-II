class Solution {
    public int trap(int[] height) {
        int left = 0; 
        int right = height.length - 1;
        int l_area = 0;
        int r_area = 0;
        int ans = 0;
        while(left < right) {
            if(height[left] < height[right]) {
                if(height[left] >= l_area){
                    l_area = height[left];
                }else{
                    ans+=(l_area - height[left]);
                }
                ++left;
            }
            else{
                if(height[right] >= r_area){
                    r_area = height[right];
                }else{
                    ans += (r_area - height[right]);
                }
                --right;
            }
        }
        
        return ans;
    }
}

/**
时间复杂度: O(n)
空间复杂度: O(1)
**/
