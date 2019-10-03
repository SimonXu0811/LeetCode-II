class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j <= i + k && j < nums.length; j++){
                if((long)Math.abs((long)nums[j] - (long)nums[i]) <= t) return true;
            }
        }
        return false;
    }
}
