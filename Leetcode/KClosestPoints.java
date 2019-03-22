class KClosestPoints {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Point> pq = new PriorityQueue<Point>(5, new Comparator<Point>(){
           @Override
            public int compare(Point p1, Point p2) {
                return Double.compare(p1.d,p2.d);
            }
        });
        
        for(int[] pair : points) {
            Point p = new Point(pair[0], pair[1]);
            pq.add(p);
        }
        int[][] op = new int[k][2];
        int c = 0;
        while(c < k) {
            Point p = pq.poll();
            op[c][0] = p.x;
            op[c][1] = p.y;
            c++;
        }
        return op;
    }
    
}

class Point {
    int x, y;
    double d;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
        d = Math.sqrt(x*x + y*y);
    }
}