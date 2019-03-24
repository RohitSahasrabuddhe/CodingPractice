class Solution {
    public int trap(int[] height) {
        // brute force approach
        int op = 0;
        for(int i = 1; i < height.length-1; i++) {
            // left max
            int rMax = 0;
            int lMax = 0;
            
            for(int j = i-1; j >= 0; j--) {
                lMax = Math.max(lMax, height[j]);
            }
            
            // right max
            for(int j = i+1; j < height.length; j++){
                rMax = Math.max(rMax, height[j]);
            }
            int add = Math.min(rMax, lMax)-height[i];
            //System.out.println("i: "+i+"Capacity: "+ add + " lMax: " + lMax + " rMax: " + rMax);
            op += Math.max(add,0);
        }
        return op;
    }
    
}