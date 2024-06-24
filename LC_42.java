
public class LC_42 {

    public int trap(int[] height) {
        int length = height.length;
        int[] left = new int[length];
        int[] right = new int[length];
        int res = 0;

        for (int i = 0; i < length; i++) {
            int leftElement = (i - 1 >= 0) ? left[i - 1] : 0;
            int max = Math.max(leftElement, height[i]);
            left[i] = max;
        }

        for (int i = length - 1; i >= 0; i--) {
            int rightElement = (i + 1 < length) ? right[i + 1] : 0;
            int max = Math.max(rightElement, height[i]);
            right[i] = max;
        }

        for (int i = 0; i < length; i++) {
            int leftElement = left[i];
            int rightElement = right[i];
            int min = Math.min(leftElement, rightElement);
            res += (min - height[i]);
        }

        return res;
    }

    public static void main(String[] args) {
        LC_42 lc = new LC_42();
        int[] example1 = {4, 2, 0, 3, 2, 5};

        System.out.println("Result: " + lc.trap(example1));
    }
}
