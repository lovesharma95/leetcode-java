
class LC_779 {

    public int kthGrammar(int n, int k) {
        if (n == 1) {
            return 0;
        }
        int x = 1 << (n - 2);
        if (k > x) {
            return 1 ^ kthGrammar(n - 1, k - x);
        }
        return kthGrammar(n - 1, k);
    }

    public static void main(String[] args) {
        LC_779 lc = new LC_779();

        int result = lc.kthGrammar(7, 2);
        System.out.print("Result: " + result);
    }
}
