public class LC_2011 {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(String op: operations) {
            if(op.equals("X++") || op.equals("++X")) {
                x += 1;
            } else {
                x -= 1;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        LC_2011 lc = new LC_2011();
        String[] example1 = {"--X","X++","X++"};

        int result = lc.finalValueAfterOperations(example1);
        System.out.print("Result: " + result);
    }
}
