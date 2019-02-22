class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> op = new ArrayList<String>();
        for (int i = 1; i <= n ; i++) {
            if (i%15 == 0) {
                op.add(new String("FizzBuzz"));
            }
            else if (i%5 == 0) {
                op.add(new String("Buzz"));
            }
            else if (i%3 == 0) {
                op.add(new String("Fizz"));
            }
            else {
                op.add(Integer.toString(i));
            }
        }
        return op;
    }
}