
class LC_238 {

    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] res = new int[length];

        for (int i = 0; i < length; i++) {
            res[i] = 1;
        }

        int leftProduct = 1;
        for (int i = 0; i < length; i++) {
            res[i] *= leftProduct;
            leftProduct *= nums[i];
        }

        int rightProduct = 1;
        for (int i = length - 1; i >= 0; i--) {
            res[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        return res;
    }

    public static void main(String[] args) {
        LC_238 lc = new LC_238();
        int[] example1 = {1, 2, 3, 4};

        int[] result = lc.productExceptSelf(example1);
        System.out.print("Result: ");
        for (int res : result) {
            System.out.print(res + ",");
        }
    }
}
