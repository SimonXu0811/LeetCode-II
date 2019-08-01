class Solution {
    public int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        int[] res = new int[2];
        int l = 0;
        int r = nums.length - 1;
        while (l != r){
            if(nums[l] + nums[r] == target){
                res[0] = l;
                res[1] = r;
                return res;
            }
            if(nums[l] + nums[r] > target){
                r--;
            }
            else{
                l++;
            }
        }
        return res;
    }
}
