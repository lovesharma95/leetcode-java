
public class LC_201 {

    public int rangeBitwiseAnd(int left, int right) {
        while (left < right) {
            right = right & (right - 1);
        }
        return left & right;
    }

    public static void main(String[] args) {
        LC_201 lc = new LC_201();

        System.out.println("Result: " + lc.rangeBitwiseAnd(5, 7));
    }
}
