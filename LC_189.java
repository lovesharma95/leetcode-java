public class LC_189 {
    //     public void rotate(int[] nums, int k) {
    //         int stack[] = new int[k];

    //         int a = k;
    //         int j = 0;
    //         int i = nums.length - 1;
    //         while(a > 0) {
    //             if (i < 0) {
    //                 i = nums.length - 1;
    //             }
    //             stack[j] = nums[i];
    //             i--;
    //             j++;
    //             a--;
    //         }

    //         int temp[] = new int[nums.length];
    //         for (int t = 0; t < nums.length; t++) {
    //             temp[t] = nums[t];
    //         }

    //         for (int l = 0; l < nums.length; l++) {
    //             if(l >= k) {
    //                 nums[l] = temp[l - k];
    //             } else {
    //                 nums[l] = stack[k - l - 1];
    //             }
    //         }
    //     }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Handle cases where k is greater than the length of the array
        if (k == 0) return;

        reverse(nums, 0, n - 1); // Reverse the entire array
        reverse(nums, 0, k - 1); // Reverse the first k elements
        reverse(nums, k, n - 1); // Reverse the rest of the array
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            // swap start with end
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        LC_189 lc = new LC_189();
        int[] example1 = {1,2,3,4,5,6,7};

        lc.rotate(example1, 3);
    }
}
