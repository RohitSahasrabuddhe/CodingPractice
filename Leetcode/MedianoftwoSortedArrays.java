class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] op = new int[n1+n2];
        int i1 = 0;
        int i2 = 0;
        int c = 0;
        while(i1 < n1 && i2 < n2){
            if(nums1[i1] <= nums2[i2]){
                op[c++] = nums1[i1++];
            } else{
                op[c++] = nums2[i2++];
            }
        }
        
        while(i1 < n1){
            op[c++] = nums1[i1++];
        }
        while(i2 < n2){
            op[c++] = nums2[i2++];
        }
        double opVal ;
        int sum = n1+n2;
        if(sum %2 == 0){
            sum = sum >> 1;
            opVal = (op[sum] + op[sum-1])*0.5;
        } else{
            sum = sum >>1;
            opVal = 1.0 * op[sum];
        }
        return opVal;
    }
}