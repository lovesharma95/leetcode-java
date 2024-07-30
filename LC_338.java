
public class LC_338 {

    public int[] countBits(int n) {
        int[] res = new int[n + 1];
        for (int j = 0; j < n + 1; j++) {
            res[j] = count(j);
        }

        return res;
    }

    private int count(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        LC_338 lc = new LC_338();

        int[] result = lc.countBits(5);
        System.out.print("Result: ");
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
