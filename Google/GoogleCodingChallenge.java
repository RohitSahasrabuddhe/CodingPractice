class Solution {
    public int kEmptySlots(int[] flowers, int k) {
        int n = flowers.length;
        boolean[] status = new boolean[n];
        int c = 1;
        for(int i : flowers) {
            status[i-1] = true;
            /*System.out.print("\n Day: " + c);
            for(boolean b : status) {
                System.out.print(b + " ");
            } */
            if(checkForK(status, k)) {
                return c;
            }
            c++;
        }
        return -1;
    }
    
    public boolean checkForK(boolean[] status, int k) {
        int countF = 0;
        int l = 0; 
        int r = 0;
        
        while(r < status.length && status[r] == false) {
            r++;
        }
        
        while(r < status.length) {
            while(r < status.length && status[r] == true) {
                 r++;
            }
            l = r;
            while(r < status.length && status[r] == false) {
                r++;
            }
            if(r < status.length && k == r-l) {
                return true;
            }
        }
        return false;
        
    }
}