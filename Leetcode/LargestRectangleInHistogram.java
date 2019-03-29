class Solution {
    public int largestRectangleArea(int[] heights) {
        return getArea(heights, 0, heights.length-1);
    }    
    
    public int getArea(int[] arr, int start, int end){       
        if(start > end){
            return 0;
        }        
        int index = start;
        for(int i = start; i <= end; i++){
            
            if(arr[index] > arr[i]){
                index = i;
            }
        }
        int minArea = arr[index] * (end-start+1);
        int leftArea = getArea(arr, start, index-1);
        int rightArea = getArea(arr, index+1, end);
       
        return Math.max(minArea, Math.max(leftArea, rightArea));
        
    }
}