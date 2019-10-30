class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        for(String s : words) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        
        List<String> list = new ArrayList<>(map.keySet());
        
        Collections.sort(list, new Comparator<String>(){
            public int compare(String s1, String s2){
                return map.get(s2) == map.get(s1) ? s1.compareTo(s2) : map.get(s2).compareTo(map.get(s1)) ;
            }
        });
        
        return list.subList(0,k);
        
    }
}

/*
时间复杂度:O(nlogn)
空间复杂度:O(n)
*/
