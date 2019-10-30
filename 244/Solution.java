class WordDistance {
    private HashMap<String, ArrayList<Integer>> map;
    public WordDistance(String[] words) {
        this.map = new HashMap<String, ArrayList<Integer>>();
        
        for(int i = 0; i < words.length; i ++){
            ArrayList<Integer> index = this.map.getOrDefault(words[i], new ArrayList<Integer>());
            index.add(i);
            this.map.put(words[i],index);
        }
    }
    
    public int shortest(String word1, String word2) {
        ArrayList<Integer> w1 = new ArrayList<>();
        ArrayList<Integer> w2 = new ArrayList<>();
        w1 = this.map.get(word1);
        w2 = this.map.get(word2);
        
        int l1 = 0;
        int l2 = 0;
        int min = Integer.MAX_VALUE;
        while (l1 < w1.size() && l2 < w2.size()){
            min  = Math.min(min, Math.abs(w1.get(l1) - w2.get(l2)));
            if(w1.get(l1) > w2.get(l2)) l2++;
            else l1++;
        }
        return min;
    }
}

/**
 * Your WordDistance object will be instantiated and called as such:
 * WordDistance obj = new WordDistance(words);
 * int param_1 = obj.shortest(word1,word2);
 */
 
 /*
 时间复杂度:O(n)
 空间复杂度:O(n)
 */
