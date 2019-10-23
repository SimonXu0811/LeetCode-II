class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] visited = new int [numCourses];
        
        List<List<Integer>> graph = new ArrayList<List<Integer>>(numCourses);
        
        for(int i = 0; i < numCourses; i++){
            graph.add(new ArrayList<Integer>());
        }
        
        for(int i = 0; i < prerequisites.length; i++){
            graph.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }
        
        int node = 0;
        for(int i = 0; i < numCourses; i++){
            if(hascircle(graph, visited, i)) return false;
        }
        
        return true;
        
    }
    
    public boolean hascircle(List<List<Integer>> graph, int[] visited, int i){
        visited[i] = -1;
        
        for(int course: graph.get(i)){
            if(visited[course] == -1) return true;
            else if (visited[course] == 0 && hascircle(graph, visited, course)) return true;
        }
        
        visited[i] = 1;
        return false;
        
    }
}
