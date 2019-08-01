class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> findSubsequences(int[] nums) {
        Arrays.sort(nums);
        DFS(nums, new ArrayList<>(), 0);
        return res;
    }
    
    private void DFS(int[] nums, List<Integer> list, int n){
        if(list.size() > 1){
            if(!res.contains(list)){
                res.add(new ArrayList(list));
            }
        }
        
        for(int i = n ; i < nums.length; i++){
            list.add(nums[i]);
            DFS(nums,list,i + 1);
            list.remove(list.size() - 1);
        }
    }
}
