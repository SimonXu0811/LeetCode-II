class Solution {
    public int shortestDistance(String[] words, String word1, String word2) {
        int l1 = -1;
        int l2 = -1;
        int dist = Integer.MAX_VALUE;
        for (int i = 0; i < words.length; i++){
            if(words[i].equals(word1)) l1 = i;
            if(words[i].equals(word2)) l2 = i;
            if(l1 != -1 && l2 != -1)
               dist = Math.min(dist, Math.abs(l1 - l2));
        }
        return dist;
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(1)
*/
