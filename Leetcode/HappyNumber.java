class Solution {
    public int addDigits(int num) {
        while(num > 9){
            int curr = num;
            int sum = 0;
            while(curr > 0){
                sum += curr%10;
                curr /= 10;
            }
            num = sum;
        }
        return num;
    }
}