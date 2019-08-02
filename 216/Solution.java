class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        BackTrace(new ArrayList<>(), k, n, 1);
        return res;
    }
    
    private void BackTrace(List<Integer> list, int num, int target, int index){
        if(list.size() == num && target == 0){
            res.add(new ArrayList<>(list));
        }
        for(int i = index; i < 10; i++){
            list.add(i);
            BackTrace(list, num, target - i, i + 1);
            list.remove(list.size() - 1);
        }
    }
}
