class PlusOne {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        
        for (int i = digits.length-1; i >= 0; i--) {
            int sum = digits[i] + carry;
            if (sum >= 10) {
                digits[i] = sum%10;
                carry = 1;
            }
            else{
                carry = 0;
                digits[i] = sum;
            }
        }
        if (carry > 0) {
            int[] op = new int[digits.length + 1];
            op[0] = carry;
            for (int i = 1; i < op.length; i++) {
                op[i] = digits[i-1];
            }
            return op;
        }else{
            return digits;
        }        
    }
}