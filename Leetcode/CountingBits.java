class CountingBits {
    public int[] countBits(int num) {
        int[] output = new int[num+1];
        if (num >= 0) {
            output[0] = 0;
        }
        
        for (int i = 0; i <= num; i++) {
            output[i] = output[i/2] + i%2;
        }
        return output;
    }
}