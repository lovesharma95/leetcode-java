
public class LC_66 {

    public int[] plusOne(int[] digits) {
        int length = digits.length;
        for (int i = length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[length + 1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        LC_66 lc = new LC_66();
        int[] example1 = {2, 3, 4, 7};

        System.out.println("Result: ");
        for (int e : lc.plusOne(example1)) {
            System.out.println(e);
        }

    }
}
