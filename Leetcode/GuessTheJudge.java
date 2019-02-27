class GuessTheJudge {
    public int findJudge(int N, int[][] trust) {
        int[] trustCountIncoming = new int[N];
        int[] trustCountOut = new int[N];
        
        for(int[] pair : trust) {
            trustCountIncoming[pair[1]-1]++;
            trustCountOut[pair[0]-1]++;
        }
        for(int i = 0; i < N; i++) {
            if (trustCountOut[i] == 0 && trustCountIncoming[i] >= N-1 ) 
                return i+1;
        }
        return -1;
    }
}