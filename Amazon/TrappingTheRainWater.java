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

    public int trapWithTwoPointers(int[] height) {
        int n = height.length;
        if(n == 0){
            return 0;
        }
        int[] lMax = new int[n];
        int[] rMax = new int[n];
        lMax[0] = 0;
        rMax[n-1] = 0;
        // generate lMax array
        for(int i = 1; i < n; i++) {
            lMax[i] = Math.max(lMax[i-1], height[i-1]);
        }
        
        // generate rMax array
        for(int i = n-2; i >= 0; i--) {
            rMax[i] = Math.max(rMax[i+1], height[i+1]);
        }
        int ans = 0;
        for(int i = 0; i < n; i++) {
            ans += Math.max((Math.min(lMax[i], rMax[i]) - height[i]), 0); 
        }
        return ans;
    }
    
}