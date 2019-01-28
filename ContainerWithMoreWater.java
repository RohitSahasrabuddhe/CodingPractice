class ContainerWithMoreWater {
    public int maxArea(int[] height) {
        int n = height.length;
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++){
                if (max < getArea(height,i,j)) {
                   max = getArea(height,i,j); 
                }
            }
        }
        return max;
    }
    
    public int getArea(int[] h, int i, int j ){
        return (j-i) * Math.min(h[i],h[j]);
    }
}