class Solution {
    public int minMeetingRooms(int[][] intervals) {
        if(intervals.length == 0) return 0;
        
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>(intervals.length, new Comparator<Integer>(){
            public int compare(Integer a, Integer b) {
                return a - b;
            }
        });
        
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b){
                return a[0] - b[0];
            }
        });
        
        heap.add(intervals[0][1]);
        
        for(int i = 1; i < intervals.length; i ++) {
            if(intervals[i][0] >= heap.peek()){
                heap.poll();
            }
            
            heap.add(intervals[i][1]);
        }
        
        return heap.size();
        
    }
}
