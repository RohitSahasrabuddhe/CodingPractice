public class NumOf1s {
    // you need to treat n as an unsigned value
    public int hammingWeightNaive(int n) {
        String strNum = Integer.toBinaryString(n);
        
        int output = 0;
        for (int i = 0; i < strNum.length(); i++) {
            if(strNum.charAt(i) == '1') {
                output++;
            }
        }
        return output;
    }
}