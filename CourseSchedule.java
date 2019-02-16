class CourseSchedule {
    public static boolean[] visited;
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        visited = new boolean[numCourses];
        // set 0 as root
        if (prerequisites.length == 0) {
            return true;
        }
        for (int i = 0; i < numCourses; i++) {
            // check for each node
            
            if ( visited[i] == false) {
                LinkedList<Integer> list = new LinkedList<Integer>();
                list.add(prerequisites[0][0]);
                
                while (!list.isEmpty()) {
                    int current = list.removeFirst();
                    
                    for (int j = 0; j < prerequisites.length; j++) {
                        if (prerequisites[j][1] == current) {
                            list.addFirst(prerequisites[j][0]);
                        }
                    }
                    
                    if(visited[current] == true) {
                        return false;
                    }
                    visited[current] = true;
                    // add first to queue adjecent elements
                    
                    
                }
                
            }
        }
       
        return true;
    }
        
    
    
}