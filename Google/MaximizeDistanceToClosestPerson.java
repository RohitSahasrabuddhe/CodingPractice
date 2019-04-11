class Solution {
    public int maxDistToClosest(int[] seats) {
        int lMax = 0;
        int rMax = 0;
        int midMax = 0;
        int l = 0;
        int r =seats.length-1;
        for(int i = 0; i < seats.length; i++){            
            if(seats[i] == 0){
                lMax++;
            } else{
                break;
            }
            l = i;
        }
        for(int i = seats.length-1; i >= 0; i--){
            if(seats[i] == 0){
                rMax++;
            } else{
                break;
            }
            r = i;
        }
        int count = 0;
        for(int i = l; i <= r; i++){
            if(seats[i] == 1){
                count = 0;
            } else{
                count++;
                midMax = Math.max(midMax, count);
            }
        }
        midMax = (midMax+1)/2;
        
        return Math.max(Math.max(lMax, rMax), midMax);
    }
}